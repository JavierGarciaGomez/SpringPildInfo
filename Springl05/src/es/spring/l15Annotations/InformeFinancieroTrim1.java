package es.spring.l15Annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements ICreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentaci�n de informe financiero del trimestre 1";
	}

}
