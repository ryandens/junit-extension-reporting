package com.github.ryandens.junit.reporting;

import java.lang.annotation.*;
import org.junit.jupiter.api.extension.ExtendWith;

/** Annotation used to register an extension that must be registered on a test class */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ExtendWith(ReportingClassExtension.class)
public @interface TestClassExtension {}
