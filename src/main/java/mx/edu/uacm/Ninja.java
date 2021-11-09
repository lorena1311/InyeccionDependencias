package mx.edu.uacm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ninja {
	/*
	 * Composición
	private Arma arma = new Chacos();
	private String mision = "mision default";
	*/
	
	@Autowired//Agregación
	@Qualifier("espada")
	private Arma arma;
	
	@Value("pasa nivel")
	private String mision;
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public String getMision() {
		return mision;
	}
	public void setMision(String mision) {
		this.mision = mision;
	}
	
	

}
