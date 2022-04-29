package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Mes_2 {

private int numero1;
	
public Mes_2() {}
	
public Mes_2(int numero1) {
		this.numero1=numero1;
	}

public int getNumero1() {
		return numero1;
	}

public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	
public String CalculoMes2() {
		
		switch(this.numero1) {
		case 1: return "El dato ingresado es un mes";
		case 2: return "El dato ingresado es un mes";
		case 3: return "El dato ingresado es un mes";
		case 4: return "El dato ingresado es un mes";
		case 5: return "El dato ingresado es un mes";
		case 6: return "El dato ingresado es un mes";
		case 7: return "El dato ingresado es un mes";
		case 8: return "El dato ingresado es un mes";
		case 9: return "El dato ingresado es un mes";
		case 10: return "El dato ingresado es un mes";
		case 11: return "El dato ingresado es un mes";
		case 12: return "El dato ingresado es un mes";
		default:return "No corresponde a un mes";
		}
	}
}
