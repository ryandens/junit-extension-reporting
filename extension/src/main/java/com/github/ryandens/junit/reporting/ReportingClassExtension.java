package com.github.ryandens.junit.reporting;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

final class ReportingClassExtension implements BeforeAllCallback {
  @Override
  public void beforeAll(ExtensionContext context) {
    context.publishReportEntry("ReportingClassExtension beforeAll");
    context.publishReportEntry("classKey", "classValue");
  }
}
