package org.wiremock;

import com.github.jknack.handlebars.Options;
import com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.HandlebarsHelper;
import java.util.Random;
import net.datafaker.Faker;
import org.apache.commons.lang3.LocaleUtils;

/*
 * Author: Shreya Agarwal
 */
public class RandomHelper extends HandlebarsHelper<Object> {

  private static final String SEED_HASH = "seed";
  private static final String LOCALE_HASH = "locale";

  private final Random random;
  private final Faker faker;

  public RandomHelper() {
    this(new Random());
  }

  RandomHelper(Random random) {
    this.random = random;
    this.faker = new Faker(random);
  }

  @Override
  public Object apply(Object context, Options options) {

    // Use a seeded/localized/default Faker if `locale` or `seed` hash exist
    final Faker myFaker = this.getFaker(options.hash(SEED_HASH), options.hash(LOCALE_HASH));

    try {
      // Used the `expression` method instead of `resolve` as the
      // resolve method is not able to resolve nested references in the yml files. For example, in
      // the resource file for en-US, `address.full_address` wasn't resolving because of the
      // `#{street_address}` nested reference, but `address.postcode_by_state.AL` would work fine.
      // `expression` is able to handle all cases.
      return myFaker.expression("#{" + context + "}");
    } catch (RuntimeException e) {
      return handleError("Unable to evaluate the expression " + context, e);
    }
  }

  private Faker getFaker(Object seed, String locale) {
    final Faker myFaker;
    if (seed != null && locale != null) {
      myFaker = new Faker(LocaleUtils.toLocale(locale), new Random(seed.hashCode()));
    } else if (seed != null) {
      myFaker = new Faker(new Random(seed.hashCode()));
    } else if (locale != null) {
      myFaker = new Faker(LocaleUtils.toLocale(locale), this.random);
    } else {
      myFaker = this.faker;
    }
    return myFaker;
  }
}
