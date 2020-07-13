package es.MVC;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	// public String processForm2(HttpServletRequest request, Model model) { 29
	public String processForm2(@RequestParam("name") String name, Model model) { // 32
		/*String name=request.getParameter("name"); 29
		String finalMsg = "Who is the best student? "+name+" is the best";
		// Adding info to the model
		model.addAttribute("msg", finalMsg);
		return "HiSpring";
		*/
		// 32
		String finalMsg = "Who is the best student? "+name+" is the best";
		model.addAttribute("msg", finalMsg);
		return "HiSpring";
		
	}
}
