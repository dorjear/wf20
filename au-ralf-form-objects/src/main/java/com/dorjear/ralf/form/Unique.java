package com.dorjear.ralf.form;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target (value={ElementType.METHOD,ElementType.FIELD})
@Retention (RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueValidator.class)
@Documented
public @interface Unique {
	
	

	  String message() default "{Unique validate error}";

	  Class<?>[] groups() default {};

	  Class<? extends Payload>[] payload() default {};


}
