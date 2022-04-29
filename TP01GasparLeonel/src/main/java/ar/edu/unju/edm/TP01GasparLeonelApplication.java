package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Año_Bisiesto;
import ar.edu.unju.edm.model.Factorial;
import ar.edu.unju.edm.model.Mes_1;
import ar.edu.unju.edm.model.Mes_2;
import ar.edu.unju.edm.model.Nota_Alumno;
import ar.edu.unju.edm.model.Numero_Par;
import ar.edu.unju.edm.model.Punto10;
import ar.edu.unju.edm.model.Punto11;
import ar.edu.unju.edm.model.Punto12;
import ar.edu.unju.edm.model.Punto8;
import ar.edu.unju.edm.model.Punto9;


@SpringBootApplication
public class TP01GasparLeonelApplication {

public static void main(String[] args) {
		SpringApplication.run(TP01GasparLeonelApplication.class, args);
		
		
		String nombre = "Leonel Alejandro Gaspar";
		System.out.println("Hola Mundo"+""+nombre);
		
		Factorial miFactorial = new Factorial(4,0);
		Año_Bisiesto miBisiesto=new Año_Bisiesto(2008);
		Mes_1 miMes= new Mes_1(5);
		Mes_2 miMes2= new Mes_2(13);
		Nota_Alumno miNotaAlumno = new Nota_Alumno(8);
		Numero_Par miNumeroPar = new Numero_Par(18);
		Punto8 miPunto8 = new Punto8(4);
		Punto9 miPunto9 = new Punto9(320);
		Punto10 miPunto10= new Punto10 (320);
		Punto11 miPunto11 = new Punto11(320);
		Punto12 miPunto12 = new Punto12(8);
		
		System.out.println("El factorial es:"+" "+miFactorial.factorial());
		System.out.println("El numero"+" "+miBisiesto.getNumero1()+" "+miBisiesto.Obtenerbisiesto());
		System.out.println("El dato ingresado"+" "+miMes.CalculoMes());
		System.out.println("El dato ingresado"+" "+miMes2.CalculoMes2());
		System.out.println(miNotaAlumno.Calificacion());
		System.out.println("Numero ingresado es"+" "+miNumeroPar.numeroPar());
		System.out.println("es: "+miPunto9.restante1());
		System.out.println("es: "+miPunto10.restante2());
		System.out.println("es: "+miPunto11.restante3());
		System.out.println("es: "+miPunto8.generarMultiplos1());
		System.out.println("es: "+miPunto12.calculoCaida());
	}
	
}