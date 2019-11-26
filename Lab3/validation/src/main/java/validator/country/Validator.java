package validator.country;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Validator implements ConstraintValidator<CountryValidator, String> {

	ListCountries ListCountries = new ListCountries();

	@Override
	public boolean isValid(String typeField, ConstraintValidatorContext context) {
		
		return typeField != null && ListCountries.Pl_european.contains(typeField.toUpperCase());
	}
}