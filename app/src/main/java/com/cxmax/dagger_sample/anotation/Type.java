package com.cxmax.dagger_sample.anotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @describe : use Qualifier to distinguish the same class but different objects
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 17-4-14.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Type {
    String value() default "";
}
