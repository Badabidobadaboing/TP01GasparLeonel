package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Año_Bisiesto;
import ar.edu.unju.edm.model.Factorial;
import ar.edu.unju.edm.model.Mes_1;
import ar.edu.unju.edm.model.Mes_2;
import ar.edu.unju.edm.model.Nota_Alumno;
import ar.edu.unju.edm.model.Numero_Par;
import ar.edu.unju.edm.model.Punto8;


@Controller
public class controlador {
	
@Autowired
Punto8 punto8;
	
	
	@GetMapping("/menu")
	
	
	public String obtenermenu() {
		return("index");
	}
	
	@GetMapping("/calculoFactorial")
    public String getFactorial(@RequestParam(name="num1")int num1,Model model) {
		int resultadoF;
		Factorial nuevoFactorial = new Factorial();
    	nuevoFactorial.setNumero1(num1);
    	resultadoF=nuevoFactorial.factorial();
    	model.addAttribute("resultadoF", resultadoF);
		return "punto1";
    	
		
	
	}
	
	@GetMapping("/calculoBisiesto")
    public String getBisiesto(@RequestParam(name="num1")int num1,Model model) {
		String resultadoB;
		Año_Bisiesto nuevoBisiesto=new Año_Bisiesto();
		nuevoBisiesto.setNumero1(num1);
    	resultadoB=nuevoBisiesto.Obtenerbisiesto();
    	model.addAttribute("resultadoB", resultadoB);
		return "punto2";
   
	}
	
	@GetMapping("/calculoMes1")
    public String getMes(@RequestParam(name="num1")int num1,Model model) {
		String resultadoM;
		Mes_1 nuevoMes=new Mes_1();
		nuevoMes.setNumero1(num1);
    	resultadoM=nuevoMes.CalculoMes();
    	model.addAttribute("resultadoM", resultadoM);
		return "punto4";
   
	}
	
	@GetMapping("/calculoMes2")
    public String getMes2(@RequestParam(name="num1")int num1,Model model) {
		String resultadoM2;
		Mes_2 nuevoMes2=new Mes_2();
		nuevoMes2.setNumero1(num1);
    	resultadoM2=nuevoMes2.CalculoMes2();
    	model.addAttribute("resultadoM2", resultadoM2);
		return "punto5";
   
	}
	
	@GetMapping("/calculoCalificacion")
    public String getCalificacion(@RequestParam(name="num1")int num1,Model model) {
		String resultadoC;
		Nota_Alumno NuevoAlumno=new Nota_Alumno();
		NuevoAlumno.setNumero1(num1);
    	resultadoC=NuevoAlumno.Calificacion();
    	model.addAttribute("resultadoC", resultadoC);
		return "punto6";
   
	}
	
	@GetMapping("/calculoPar")
    public String getPar(@RequestParam(name="num1")int num1,Model model) {
		String resultadoP;
		Numero_Par miPar = new Numero_Par();
		miPar.setNumero1(num1);
    	resultadoP=miPar.numeroPar();
    	model.addAttribute("resultadoPar", resultadoP);
		return "punto3";
   
	}
	
	
	@GetMapping("/calculoMultiplos")
	public ModelAndView getMultiplo1 (@RequestParam (name= "num1") String numero) {
		punto8.setNumero1(Integer.valueOf(numero));
		String resultadoMultiplos=punto8.generarMultiplos1();
		ModelAndView modelView = new ModelAndView("punto8");
		modelView.addObject("resultadoMultiplos",resultadoMultiplos);
		modelView.addObject("numero",numero);
		return modelView;
		
		
		
		
	}
	
	
	
	
    
		
		
		
	
	
	
	
	

}