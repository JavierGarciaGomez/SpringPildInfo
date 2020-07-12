package es.spring.l13_;

public class SecretarioEmpleado implements iEmpleados {

	private iCreadorInformes informeNuevo;
	private String nombreEmpresa;
	private String email;
	
	public void setInformeNuevo(iCreadorInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String getInforme() {
		return "Informe generado por el SECRETARIO: "+informeNuevo.getInforme();
	}

	
	@Override
	public String getTareas() {
		return "Gestionar la agenda de los jefes";
	}

	public iCreadorInformes getInformeNuevo() {
		return informeNuevo;
	}

	
	
	
	

}
