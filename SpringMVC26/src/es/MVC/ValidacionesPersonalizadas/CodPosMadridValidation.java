package es.MVC.ValidacionesPersonalizadas;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CodPosMadridValidation implements ConstraintValidator<CodPosMadrid, String> {
	private String prefijoMadrid;

	@Override
	public void initialize(CodPosMadrid codPosMadrid) {
		prefijoMadrid=codPosMadrid.value();
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		boolean valCodigo;
		if(arg0!=null) valCodigo=arg0.startsWith(prefijoMadrid);
		else return valCodigo=true;
		return valCodigo;
	}

}
