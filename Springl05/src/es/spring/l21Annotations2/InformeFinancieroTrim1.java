package es.spring.l21Annotations2;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements ICreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentación de informe financiero del trimestre 1";
	}

}
