package es.spring.l15Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Call the annotation
@Component
public class ComercialExperimentado implements iEmpleados {
	
	@Autowired 
	@Qualifier("informeTest")
	private ICreacionInformeFinanciero informeFinanciero;
	
	// Con esto busca la interfaz y obtiene la clase que implemente esa interfaz. Si hubiera más de uno no funciona
	
/*	public ComercialExperimentado(ICreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}
	
	// 19

	public void setInformeFinanciero(ICreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}
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

	
	

}
