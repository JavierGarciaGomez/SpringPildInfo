package es.spring.l21Annotations2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// Lesson 21
		System.out.println("************LESSON 21****************");
		// Cargar xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext21.xml");
		// Pedir el bean con annotation
		iEmpleados comercial1 = context.getBean("comercialExperimentado", iEmpleados.class);
		iEmpleados comercial2 = context.getBean("comercialExperimentado", iEmpleados.class);

		System.out.println(comercial1 + " " + comercial2);
		context.close();

		// Lesson 23 config javaClass not XML
		System.out.println("************LESSON 23****************");
		// config
		AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		// Pedir el bean con annotation
		comercial1 = config.getBean("comercialExperimentado", iEmpleados.class);
		
		System.out.println(comercial1);
		
		// Lesson 23 config javaClass not XML
		System.out.println("************LESSON 24****************");
		iEmpleados empleado = config.getBean("directorFinanciero", iEmpleados.class);
		System.out.println(empleado.getInforme());
		System.out.println(empleado.getTareas());

		
		
		context.close();

	}

}
