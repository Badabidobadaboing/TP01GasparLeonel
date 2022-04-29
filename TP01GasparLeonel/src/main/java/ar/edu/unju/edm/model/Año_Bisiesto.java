package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Año_Bisiesto {

	private int numero1;
	
public Año_Bisiesto() {		
	}
	
public Año_Bisiesto(int numero1) {
		this.numero1=numero1;
	}

public int getNumero1() {
		return numero1;
	}

public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

public String Obtenerbisiesto() {
		
		if ((this.numero1 % 4 ==0)&&(this.numero1 % 100 != 0  || this.numero1 % 400 == 0 )) {
			return "es un año bisiesto";
		}
		else {
			return "no es un año bisiesto";
		}		
	}
}