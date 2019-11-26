package validator.type;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Validator implements ConstraintValidator<TypeValidator, String> {

	@Override
	public boolean isValid(String typeField, ConstraintValidatorContext context) {
		return typeField != null && (typeField.equals("student") || typeField.equals("anObject"));
	}
}