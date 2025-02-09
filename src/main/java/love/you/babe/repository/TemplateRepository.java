/**
 * Copyright (c) 2025 happy
 * This file can be used by MIT License.
 * See details at [LICENSE](/LICENSE)
 */

package love.you.babe.repository;

import love.you.babe.repository.entity.TemplateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Template Repository.
 */
@Repository
public interface TemplateRepository extends JpaRepository<TemplateEntity, Long> {

}
