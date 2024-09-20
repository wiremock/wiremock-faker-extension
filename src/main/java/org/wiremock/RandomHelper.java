package org.wiremock;

import com.github.jknack.handlebars.Options;
import com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.HandlebarsHelper;
import java.util.Random;
import net.datafaker.Faker;

/*
 * Author: Shreya Agarwal
 */
public class RandomHelper extends HandlebarsHelper<Object> {

  private static final String SEED_HASH = "seed";

  private final Faker faker;

  public RandomHelper() {
    faker = new Faker();
  }

  @Override
  public Object apply(Object context, Options options) {

    // Use a seeded Faker if seed hash exists
    final var seedOption = options.hash(SEED_HASH);
    var myFaker = seedOption == null ? faker : new Faker(new Random(seedOption.hashCode()));

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
}
