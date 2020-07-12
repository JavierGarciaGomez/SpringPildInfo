package es.spring.l13_;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// Lesson 13
		System.out.println("************LESSON 13****************");
		// Cargar xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext13.xml");
		// Pedir el bean con Prototype
		SecretarioEmpleado secretarioEmp1 = context.getBean("secEmp", SecretarioEmpleado.class);
		SecretarioEmpleado secretarioEmp2 = context.getBean("secEmp", SecretarioEmpleado.class);

		System.out.println(secretarioEmp1 + " " + secretarioEmp2);

		// Pedir el bean con Singleton
		iEmpleados directorEmp1 = context.getBean("dirEmp", DirectorEmpleado.class);
		iEmpleados directorEmp2 = context.getBean("dirEmp", DirectorEmpleado.class);
		System.out.println(directorEmp1 + " " + directorEmp2);

		// Lesson 14
		System.out.println("************LESSON 14****************");
		System.out.println(directorEmp1.getInforme());
		
		context.close();

	}

}
