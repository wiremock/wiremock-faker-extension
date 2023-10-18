package org.wiremock;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import com.github.tomakehurst.wiremock.testsupport.WireMockResponse;
import com.github.tomakehurst.wiremock.testsupport.WireMockTestClient;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

public class RandomExtensionTest {

  @RegisterExtension
  public WireMockExtension wm =
      WireMockExtension.newInstance()
          .options(
              wireMockConfig()
                  .dynamicPort()
                  .templatingEnabled(true)
                  .globalTemplating(true)
                  .extensions(RandomExtension.class))
          .build();

  WireMockTestClient client;

  @BeforeEach
  void init() {
    client = new WireMockTestClient(wm.getPort());
  }

  @Test
  void appliesHelpersFromProvider() {
    wm.stubFor(get("/something-fake").willReturn(ok("{{ random 'Name.firstName' }}")));

    WireMockResponse response = client.get("/something-fake");

    assertThat(response.content(), is(Matchers.any(String.class)));
    assertThat(response.content(), Matchers.not("Name.firstName"));
  }
}
