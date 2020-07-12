package es.spring.l13_;

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
