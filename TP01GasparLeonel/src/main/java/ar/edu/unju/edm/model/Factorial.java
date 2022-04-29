package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Factorial {
	
	private int numero1;
	private int numero2;
	
public Factorial() {	
	}
	
public Factorial(int numero1,int numero2) {	
		this.numero1=numero1;
		this.numero2=numero2;
	}

public int getNumero1() {
		return numero1;
	}

public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

public int getNumero2() {
		return numero2;
	}

public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
public int factorial() {
		if (this.numero1>=0 && this.numero1<=10) {
			int resultadofactorial=1;
			while(this.numero1 !=0) {
				resultadofactorial= resultadofactorial * this.numero1;
				this.numero1 --;
			}
			return resultadofactorial;
		}
		else {
			return 0;
		}	
	}
}
