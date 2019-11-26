package validator.type;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = Validator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface TypeValidator {
    String message() default "Nieodpowiedni typ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}