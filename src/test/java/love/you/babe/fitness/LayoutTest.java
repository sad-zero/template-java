/**
 * Copyright (c) 2025 happy
 * This file can be used by MIT License.
 * See details at [LICENSE](/LICENSE)
 */

package love.you.babe.fitness;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;
import static com.tngtech.archunit.library.dependencies.SlicesRuleDefinition.slices;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.Test;

/**
 * Layout Test.
 */
public class LayoutTest {
  private final String basePackage = "love.you.babe";

  @Test
  public void layerTest() {
    JavaClasses importedClasses = new ClassFileImporter().importPackages(basePackage);

    ArchRule rule = layeredArchitecture().consideringAllDependencies().layer("Controller")
        .definedBy("..controller..").layer("Service").definedBy("..service..").layer("Repository")
        .definedBy("..repository..").whereLayer("Controller").mayNotBeAccessedByAnyLayer()
        .whereLayer("Service").mayOnlyBeAccessedByLayers("Controller", "Repository")
        .whereLayer("Repository").mayOnlyBeAccessedByLayers("Service").withOptionalLayers(true);
    rule.check(importedClasses);
  }

  @Test
  public void cyclicTest() {
    JavaClasses importedClasses = new ClassFileImporter().importPackages(basePackage);

    ArchRule rule = slices().matching(basePackage.concat(".(*)..")).should().beFreeOfCycles();
    rule.check(importedClasses);
  }

}
