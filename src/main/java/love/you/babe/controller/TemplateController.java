/**
 * Copyright (c) 2025 happy
 * This file can be used by MIT License.
 * See details at [LICENSE](/LICENSE)
 */

package love.you.babe.controller;

import lombok.RequiredArgsConstructor;
import love.you.babe.service.TemplateService;
import openapi.api.TemplateApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * Template Controller.
 */
@RestController
@RequiredArgsConstructor
public class TemplateController implements TemplateApi {
  private final TemplateService templateService;

  @Override
  public ResponseEntity<Void> getTemplate() {
    templateService.action();
    return ResponseEntity.ok(null);
  }

}
