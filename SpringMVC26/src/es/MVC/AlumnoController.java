package es.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@ModelAttribute("alumno") Alumno alumno) {
		
		
		return "confirmacionRegistroAlumno";
	}
	
	
}
