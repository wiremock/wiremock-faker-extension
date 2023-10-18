package org.wiremock;

import com.github.jknack.handlebars.Options;
import com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.HandlebarsHelper;
import net.datafaker.Faker;

/*
 * Author: Shreya Agarwal
 */
public class RandomHelper extends HandlebarsHelper<Object> {

  private final Faker faker;

  public RandomHelper() {
    faker = new Faker();
  }

  @Override
  public Object apply(Object context, Options options) {
    try {
      // Used the `expression` method instead of `resolve` as the
      // resolve method is not able to resolve nested references in the yml files. For example, in
      // the resource file for en-US, `address.full_address` wasn't resolving because of the
      // `#{street_address}` nested reference, but `address.postcode_by_state.AL` would work fine.
      // `expression` is able to handle all cases.
      return faker.expression("#{" + context + "}");
    } catch (RuntimeException e) {
      return handleError("Unable to evaluate the expression " + context, e);
    }
  }
}
