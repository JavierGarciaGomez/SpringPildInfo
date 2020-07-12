package es.spring.ioc.l06_09;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// Cargar xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Pedir el bean
		iEmpleados empleado = context.getBean("jefeEmp", iEmpleados.class);

		// Utilizar el bean
		System.out.println(empleado.getTareas());

		empleado = context.getBean("dirEmp", iEmpleados.class);
		System.out.println(empleado.getTareas());
		// Cerrar el XML
		context.close();

		// Lesson 9
		System.out.println("************LESSON 9****************");
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		empleado = context.getBean("dirEmp", iEmpleados.class);
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());
		empleado = context.getBean("jefeEmp", iEmpleados.class);
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());
		
		context.close();
		
		// Lesson 10
		System.out.println("************LESSON 10****************");
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		empleado = context.getBean("secEmp", iEmpleados.class);
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());
		context.close();
	}

}
