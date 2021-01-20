package com.company;

import java.lang.annotation.*;


@Inherited
@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Test {
    int a() default 0;
    int b() default 0;
}
