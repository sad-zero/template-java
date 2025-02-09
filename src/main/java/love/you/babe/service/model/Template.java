/**
 * Copyright (c) 2025 happy
 * This file can be used by MIT License.
 * See details at [LICENSE](/LICENSE)
 */

package love.you.babe.service.model;

import love.you.babe.repository.entity.TemplateEntity;

/**
 * Template Model.
 */
public record Template(String template) {
  /**
   * Convert to an entity.
   *
   * @return TemplateEntity
   */
  public TemplateEntity to() {
    return TemplateEntity.getInstance(template);
  }

}
