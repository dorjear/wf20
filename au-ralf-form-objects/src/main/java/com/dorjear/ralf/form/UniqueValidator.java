package com.dorjear.ralf.form;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueValidator implements ConstraintValidator<Unique, Object>  {
	

	public void initialize(Unique constraintAnnotation) {
	}

	public boolean isValid(Object value, ConstraintValidatorContext context) {
		String[] set_value = (String[]) value;
		List<String> valueList = Arrays.asList(set_value);
		Set<String> set = new HashSet<String>(valueList);
		return set.size()==valueList.size();
	}

}
