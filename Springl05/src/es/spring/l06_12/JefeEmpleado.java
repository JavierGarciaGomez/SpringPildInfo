package es.spring.l06_12;

public class JefeEmpleado implements iEmpleados{
	
	private iCreadorInformes informeNuevo;
	
	public JefeEmpleado(iCreadorInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados";
	}

	@Override
	public String getInforme() {
		return "Informe presentado por el JEFE"+informeNuevo.getInforme();
	}
	
	

}
