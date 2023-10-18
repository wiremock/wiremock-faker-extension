package org.wiremock;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import com.github.tomakehurst.wiremock.extension.responsetemplating.helpers.HandlebarsHelperTestBase;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Random;
import net.datafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RandomHelperTest extends HandlebarsHelperTestBase {
  RandomHelper helper;

  @BeforeEach
  public void init() {
    helper = new RandomHelper();
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
  @CsvSource(value = {"123456789, Name.firstName, Herb", "123456789, Name.lastName, Hauck"})
  public void returnsRandomValue(int seed, String expression, String expected) throws Exception {
    Field newFaker = helper.getClass().getDeclaredField("faker");
    newFaker.setAccessible(true);
    newFaker.set(helper, new Faker(new Random(seed)));

    String actual = renderHelperValue(helper, expression);
    assertThat(actual, is(expected));
  }
}
