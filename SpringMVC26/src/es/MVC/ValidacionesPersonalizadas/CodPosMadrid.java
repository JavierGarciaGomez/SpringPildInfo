package es.MVC.ValidacionesPersonalizadas;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CodPosMadridValidation.class) // futura clase que contendr� la l�gica de la validaci�n
@Target({ElementType.METHOD, ElementType.FIELD}) // destino de nuestra validaci�n
@Retention(RetentionPolicy.RUNTIME) // Chequea la anotaci�n en tiempo de ejecuci�n

public @interface CodPosMadrid {
	// Definir el CP por defecto
	public String value() default "28";
	// Definir el mensaje de error
	public String message() default "El c�digo postal debe comenzar por 28";
	//Definir los grupos
	Class<?>[] groups() default{};
	//Definir los payloads
	Class<? extends Payload>[] payload() default {};
	
}
