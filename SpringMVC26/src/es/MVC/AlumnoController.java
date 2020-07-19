package es.MVC;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	// En este método está el modelo
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(Model modelo) {
		Alumno alumno = new Alumno();
		modelo.addAttribute("alumno", alumno);
		
		return "alumnoRegistroFormulario";
	}
	
	//39 especificar validación BindingResult y @Valid
	/* 39 Si en el formulario hay errores debe volver al formulario original: registroFormulario.
	 * En caso contrario que se vaya a confirmacionRegistroAlumno*/
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@Valid @ModelAttribute("alumno") Alumno alumno, BindingResult resultadoValidacion) {
		if(resultadoValidacion.hasErrors()) {
			return "alumnoRegistroFormulario";
		}
		
		return "confirmacionRegistroAlumno";
	}
	
	// 41. INITBINDER
	@InitBinder
	public void binde (WebDataBinder binder) {
		StringTrimmerEditor recortarEspaciosBlanco = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, recortarEspaciosBlanco);
	}
	
	
}
