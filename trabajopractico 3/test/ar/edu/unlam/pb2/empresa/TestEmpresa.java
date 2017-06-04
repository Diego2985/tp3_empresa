package ar.edu.unlam.pb2.empresa;

import junit.framework.TestCase;

public class TestEmpresa extends TestCase {
	
	public void testNuevoEmpleado() {
		 Gerente miGerente = new Gerente("Juan", 30000.0, 1, 4, 1980);
		 Director miDirector= new Director("Pedro", 50000.0,3 , 7, 1979);
		 Ingeniero miIngeniero= new Ingeniero("Carlos", 20000.0, 6, 9, 1990);
		 Secretaria miSecretaria= new Secretaria("Maria", 15000.0, 15, 10, 1995);
		 ManejoImpuesto miImpuesto= new ManejoImpuesto();
		
		miGerente.setCochera(5);
		miDirector.setCochera(1);
		miDirector.setSalarioPlus(2500.0);
		System.out.println(miGerente.toString());
		System.out.println(miDirector.toString());
		System.out.println(miIngeniero.toString());
		System.out.println(miSecretaria.toString());
		
		double imp;
		imp = miImpuesto.calcularImpuesto(miGerente);
		System.out.println("gerente: " + imp);
		imp = miImpuesto.calcularImpuesto(miDirector);
		System.out.println("director: " + imp);
		imp = miImpuesto.calcularImpuesto(miIngeniero);
		System.out.println("ingeniero: " + imp);
		imp = miImpuesto.calcularImpuesto(miSecretaria);
		System.out.println("secretaria: " + imp);
		
		
		
		
		
	}

}