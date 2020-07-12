package es.spring.l21Annotations2;

import org.springframework.stereotype.Component;

@Component
public class InformeTest implements ICreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentación de informe TEST";
	}

}
