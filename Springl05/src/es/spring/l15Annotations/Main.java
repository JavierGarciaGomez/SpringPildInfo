package es.spring.l15Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// Lesson 16
		System.out.println("************LESSON 16****************");
		// Cargar xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext15.xml");
		// Pedir el bean con annotation
		iEmpleados comercial = context.getBean("comercialExperimentado", iEmpleados.class); // el nombre del bean es el de la clase en minúscula
		
		System.out.println(comercial.getTareas());
		// Lesson 17
		System.out.println("************LESSON 17****************");

		
		System.out.println(comercial.getInforme());

		
		context.close();

	}

}
