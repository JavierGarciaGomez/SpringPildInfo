package es.spring.l06_12;

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
		
		// Lesson 11
		System.out.println("************LESSON 11****************");
		SecretarioEmpleado secretarioEmp = context.getBean("secEmp", SecretarioEmpleado.class);
		System.out.println("Nombre de empresa: "+secretarioEmp.getNombreEmpresa()+". email común: "+secretarioEmp.getEmail());
		
		// Lesson 12 inyección mediante archivo externo
		System.out.println("************LESSON 11****************");
		DirectorEmpleado directorEmp = context.getBean("dirEmp", DirectorEmpleado.class);
		System.out.println("Nombre de empresa: "+directorEmp.getNombreEmpresa()+". email común: "+directorEmp.getEmail());
		
		context.close();
		
	}

}
