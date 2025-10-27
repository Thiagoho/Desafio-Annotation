package com.example.usuariovalidator.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = EmailCorporativoValidator.class)
@Target({ FIELD })
@Retention(RUNTIME)
public @interface EmailCorporativo {
    String message() default "E-mail deve ser corporativo (terminar com @empresa.com)";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}