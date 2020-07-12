package es.spring.l21Annotations2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//Call the annotation
@Component
public class DirectorFinanciero implements iEmpleados {
	
	private ICreacionInformeFinanciero informeCompras;

	
	public DirectorFinanciero(ICreacionInformeFinanciero informeCompras) {
		this.informeCompras = informeCompras;
	}

	
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Dirigir financieramente";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeCompras.getInformeFinanciero();
	}

}
