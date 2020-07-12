package es.spring.ioc.l06_09;

public class DirectorEmpleado implements iEmpleados {

	// Creación de campo tipo creación informe(interfaz)
	private iCreadorInformes informeNuevo;
	
	// Constructor que inyecta la dependencia
	public DirectorEmpleado(iCreadorInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar toda la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el director: "+informeNuevo.getInforme();
	}

}
