/**
 * Copyright (c) 2025 happy
 * This file can be used by MIT License.
 * See details at [LICENSE](/LICENSE)
 */

package love.you.babe.service;

import lombok.RequiredArgsConstructor;
import love.you.babe.repository.TemplateRepository;
import love.you.babe.service.model.Template;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * TemplateService.
 */
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TemplateService {
  private final TemplateRepository templateRepository;

  /**
   * do transactional action.
   */
  @Transactional
  public void action() {
    final var template = new Template("template");
    var entity = template.to();
    templateRepository.save(entity);
    final var actual = templateRepository.findById(entity.getId())
        .map(e -> new Template(e.getTemplate())).orElseThrow();
    if (!template.equals(actual)) {
      throw new RuntimeException();
    }
    return;
  }
}
