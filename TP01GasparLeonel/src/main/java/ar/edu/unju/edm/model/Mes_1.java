package ar.edu.unju.edm.model;


import org.springframework.stereotype.Component;

@Component
public class Mes_1 {
	
	private int numero1;
	
public Mes_1() {}
	
public Mes_1(int numero1) {
		this.numero1=numero1;
	}

public int getNumero1() {
		return numero1;
	}

public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	
public String CalculoMes() {
		
		if(this.numero1>0 && this.numero1<=12) {
			return "si es un mes del año";
		}
		else {
			return "no corresponde a un mes del año";
		}
	}
}