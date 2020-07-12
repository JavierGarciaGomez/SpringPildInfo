package es.spring.l21Annotations2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.spring.l21Annotations2")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {

	// Definir el bean para el informe financiero
	@Bean
	public ICreacionInformeFinanciero informeFinancieroCompras() {
		return new InformeFinancieroCompras();
	}
	
	// Definir el bean para el dirInf e inyectar dependencias
	@Bean
	public iEmpleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroCompras());
	}
		
}
