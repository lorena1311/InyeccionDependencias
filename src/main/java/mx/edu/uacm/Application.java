package mx.edu.uacm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	private static final Logger log = LogManager.getLogger(Application.class);
	public static void main(String[] args) {
		/* Sin uso de Spring
		Ninja ninja = new Ninja();
		
		//Inyeccion de dependencias
		//Agregación
		ninja.setArma(new Chacos());
		
		//Inyeccion de dependencias
		//Agregación
		ninja.setMision("pasar nivel uno");*/
		
		//Utilizamos spring para inyectar las dependencias
		
		ApplicationContext contenedor = new ClassPathXmlApplicationContext("/context.xml");
		Ninja ninja = (Ninja)contenedor.getBean("ninja");
		log.debug("arma del ninja" + ninja.getArma());
	}
}
