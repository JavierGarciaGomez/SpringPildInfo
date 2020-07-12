package es.spring.l13_;

public class DirectorEmpleado implements iEmpleados {

	// Creación de campo tipo creación informe(interfaz)
	private iCreadorInformes informeNuevo;
	private String nombreEmpresa;
	private String email;

	// Constructor que inyecta la dependencia
	public DirectorEmpleado() {

	}

	// Constructor que inyecta la dependencia
	public DirectorEmpleado(iCreadorInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

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
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar toda la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el director: " + informeNuevo.getInforme();
	}
	
	// METODO INIT
	public void init() {
		System.out.println("Dentro del método INIT de"+this.getClass() );
	}
	
	// METODO DESTROY
	public void destroy() {
		System.out.println("Dentro del método DESTROY de "+this.getClass());
	}

}
