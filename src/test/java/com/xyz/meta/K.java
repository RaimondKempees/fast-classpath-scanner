package com.xyz.meta;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@D
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface K {
}