/**
 * Copyright (c) 2025 happy
 * This file can be used by MIT License.
 * See details at [LICENSE](/LICENSE)
 */

package love.you.babe.contracts;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import openapi.api.TemplateApi;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

/**
 * Contract Base.
 */
@SpringBootTest
@Import(TestcontainersConfiguration.class)
@ActiveProfiles("test")
public abstract class TemplateBase {
  @Autowired
  private TemplateApi templateApi;

  @BeforeEach
  void setUp() {
    RestAssuredMockMvc.standaloneSetup(templateApi);
  }

}
