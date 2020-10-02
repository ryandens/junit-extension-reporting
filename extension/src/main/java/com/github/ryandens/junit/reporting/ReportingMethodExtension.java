package com.github.ryandens.junit.reporting;

import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

final class ReportingMethodExtension implements BeforeEachCallback {
  @Override
  public void beforeEach(ExtensionContext context) {
    context.publishReportEntry("ReportingMethodExtension beforeEach");
    context.publishReportEntry("methodKey", "methodValue");
  }
}
