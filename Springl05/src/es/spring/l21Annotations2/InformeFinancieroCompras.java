package es.spring.l21Annotations2;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroCompras implements ICreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentación de informe financiero de COMPRAS";
	}

}
