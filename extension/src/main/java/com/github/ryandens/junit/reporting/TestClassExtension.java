package com.github.ryandens.junit.reporting;

import java.lang.annotation.*;

/** Annotation used to register an extension that must be registered on a test class */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestClassExtension {}
