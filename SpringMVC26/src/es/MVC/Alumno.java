package es.MVC;

import javax.validation.constraints.*;

import es.MVC.ValidacionesPersonalizadas.CodPosMadrid;

public class Alumno {
	// 39. Notnull annotations	
	@NotNull
	@Size(min=2, message="No puede ser inferior a dos letras")
	private String nombre;
	private String apellido;
	private String optativa; 
	private String ciudad;
	private String idioma;
	private final String mensajeEdad="La edad debe estar entre 10 y 99";
	// 40. @Min @Max @Email	
	@Min(value=10, message=mensajeEdad)
	@Max(value=99, message=mensajeEdad)
	private int edad;
	@Email(message="Tiene que tener formato de email")
	private String email;
	// 42 Regex validation
	@Pattern(regexp="[0-9]{5}", message="solo 5 valores numéricos")
	private String codigoPostal;
	// 45 Validación propia
	@CodPosMadrid
	private String codigoPostalMadrid;
	
	
	
	

	public String getCodigoPostalMadrid() {
		return codigoPostalMadrid;
	}

	public void setCodigoPostalMadrid(String codigoPostalMadrid) {
		this.codigoPostalMadrid = codigoPostalMadrid;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Alumno(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getOptativa() {
		return optativa;
	}

	public void setOptativa(String optativa) {
		this.optativa = optativa;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	

}
