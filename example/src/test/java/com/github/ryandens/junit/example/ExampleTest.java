package com.github.ryandens.junit.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.ryandens.junit.reporting.TestClassExtension;
import com.github.ryandens.junit.reporting.TestMethodExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;

@TestClassExtension
final class ExampleTest {

  @Test
  void foo() {
    assertEquals(10, 5 + 5);
  }

  @Test
  @TestMethodExtension
  void bar() {
    assertEquals(25, 5 * 5);
  }

  /**
   * This test is disabled when the {@code CI} environment variable is present to keep the build
   * pipeline but allow me to see how test failures render in local development
   */
  @Test
  @TestMethodExtension
  @DisabledIfEnvironmentVariable(named = "CI", matches = ".*")
  void alwaysFails() {
    assertEquals(24, 5 * 6);
  }
}
