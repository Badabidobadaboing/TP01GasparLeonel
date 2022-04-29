package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Numero_Par {
	
	private int numero1;
	
public Numero_Par() {}
	
public Numero_Par(int numero1) {
		this.numero1=numero1;
	}

public int getNumero1() {
		return numero1;
	}

public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	
public String numeroPar() {
		
		if(this.numero1%2==0) {
			
			return "Es par";
		}
		else {
			return "No es par";
		}
			
	}

}