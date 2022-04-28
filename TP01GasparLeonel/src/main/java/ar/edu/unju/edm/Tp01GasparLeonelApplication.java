package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Año_Bisiesto;
import ar.edu.unju.edm.model.Factorial;
import ar.edu.unju.edm.model.Mes_1;
import ar.edu.unju.edm.model.Mes_2;
import ar.edu.unju.edm.model.Nota_Alumno;
import ar.edu.unju.edm.model.Numero_Par;


@SpringBootApplication
public class Tp01GasparLeonelApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp01GasparLeonelApplication.class, args);
		
		
		String nombre = "Leonel Alejandro Gaspar";
		System.out.println("Hola Mundo"+""+nombre);
		
		Factorial miFactorial = new Factorial(4,0);
		Año_Bisiesto miBisiesto=new Año_Bisiesto(2008);
		Mes_1 miMes1= new Mes_1(5);
		Mes_2 miMes2= new Mes_2(13);
		Nota_Alumno miNotaAlumno = new Nota_Alumno(8);
		Numero_Par miNumeroPar = new Numero_Par(18);
		
		
		
		System.out.println("El resultado del factorial es:"+" "+miFactorial.factorial());
		System.out.println("El numero"+" "+miBisiesto.getNumero1()+" "+miBisiesto.Obtenerbisiesto());
		System.out.println("El Dato ingresado"+" "+ miMes1.CalculoMes());
		System.out.println("El Dato ingresado"+" "+ miMes2.CalculoMes2());
		System.out.println(miNotaAlumno.Calificacion());
		System.out.println("Numero ingresado es"+" "+ miNumeroPar.numeroPar());
		
		
	}
	
	

}
