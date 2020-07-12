package es.spring.l21Annotations2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//Call the annotation
@Component
public class ComercialExperimentado implements iEmpleados {

	@Autowired
	@Qualifier("informeTest")
	private ICreacionInformeFinanciero informeFinanciero;

	// Con esto busca la interfaz y obtiene la clase que implemente esa interfaz. Si
	// hubiera más de uno no funciona

	/*
	 * public ComercialExperimentado(ICreacionInformeFinanciero informeFinanciero) {
	 * this.informeFinanciero = informeFinanciero; }
	 * 
	 * // 19
	 * 
	 * public void setInformeFinanciero(ICreacionInformeFinanciero
	 * informeFinanciero) { this.informeFinanciero = informeFinanciero; }
	 */

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}

	// 22
	// init
	@PostConstruct
	public void init() {
		System.out.println("Estoy en el init");
	}

	// destroy
	@PreDestroy
	public void destroy() {
		System.out.println("Estoy en el destroy");
	}

	// destroy

}
