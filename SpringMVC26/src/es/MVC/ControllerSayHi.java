package es.MVC;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerSayHi {

	@RequestMapping("/showForm")
	public String showForm() {
		return "SayHiForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "HiSpring";
	}
	
	@RequestMapping("/processForm2") // 29
	public String processForm2(HttpServletRequest request, Model model) {
		String name=request.getParameter("name");
		String finalMsg = "Who is the best student? "+name+" is the best";
		// Adding info to the model
		model.addAttribute("msg", finalMsg);
		return "HiSpring";
	}
}
