package org.wiremock;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.HandlebarsHelperTestBase;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RandomHelperTest extends HandlebarsHelperTestBase {
  RandomHelper helper;

  @BeforeEach
  public void init() {
    helper = new RandomHelper(new Random(123456789L));
  }

  @Test
  public void rendersAMeaningfulErrorWhenExpressionIsInvalid() throws IOException {
    testHelperError(
        helper,
        "something really random",
        null,
        is("[ERROR: Unable to evaluate the expression something really random]"));
  }

  @ParameterizedTest
  @CsvSource(
      value = {
        "Name.firstName, Herb",
        "Name.lastName, Hauck",
      })
  public void returnsRandomValue(String expression, String expected) throws Exception {
    String actual = renderHelperValue(helper, expression);
    assertThat(actual, is(expected));
  }

  @ParameterizedTest
  @CsvSource(
      value = {
        ", , Herb",
        ", es, José María",
        ", fr_QC, Clément",
        "1, , Donny",
        "hello, , Nickie",
        "test, de, Franz"
      })
  public void rendersSeededLocalizedRandomValue(Object seed, Object locale, String expected) {
    final var map = new HashMap<String, Object>();
    if (seed != null) {
      map.put("seed", seed);
    }
    if (locale != null) {
      map.put("locale", locale);
    }

    final var actual = helper.apply("Name.firstName", createOptions(map));

    assertThat(actual, is(expected));
  }
}
