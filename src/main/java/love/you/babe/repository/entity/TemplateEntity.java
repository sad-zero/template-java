/**
 * Copyright (c) 2025 happy
 * This file can be used by MIT License.
 * See details at [LICENSE](/LICENSE)
 */

package love.you.babe.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Template Entity.
 */
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class TemplateEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  Long id;
  String template;

  /**
   * Create a new entity.
   *
   * @param template the template used to create the new entity
   * @return a new instance of TemplateEntity created from the template
   */

  public static TemplateEntity getInstance(String template) {
    return new TemplateEntity(null, template);
  }

}
