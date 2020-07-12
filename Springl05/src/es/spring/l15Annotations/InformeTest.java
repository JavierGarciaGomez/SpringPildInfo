package es.spring.l15Annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeTest implements ICreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentación de informe TEST";
	}

}
