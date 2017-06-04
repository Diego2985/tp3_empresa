package ar.edu.unlam.pb2.empresa;

import org.junit.Assert;
import org.junit.Test;


public class EmpresaTest {

	@Test
	public void testGerente() {
		Gerente miGerente = new Gerente("Juan", 30000.0, 1, 4, 1980);
		miGerente.setCochera(5);
		
		String brindarDetalleActual = miGerente.brindarDetalles();
		String brindarDetalleEsperado = "Gerente: Nombre: Juan - Fecha de Nacimiento: 1/4/1980 - Salario: 30000.0 - Cochera: 5";
		
		Assert.assertEquals(brindarDetalleEsperado, brindarDetalleActual);
		

	}
	
	@Test
	public void testDirector() {
		Director miDirector= new Director("Pedro", 50000.0,3 , 7, 1979);
		miDirector.setCochera(1);
		miDirector.setSalarioPlus(2500.0);
		
		String brindarDetalleActual = miDirector.brindarDetalles();
		String brindarDetalleEsperado = "Director: Nombre: Pedro - Fecha de Nacimiento: 3/7/1979 - Cochera: 1 - Salario basico: 50000.0 - Salario Plus: 2500.0 - Salario Total: 52500.0";		;
		
		Assert.assertEquals(brindarDetalleEsperado, brindarDetalleActual);
		
	}
	
	@Test
	public void testSecretaria() {
		Empleado miSecretaria= new Secretaria("Maria", 15000.0, 15, 10, 1995);
		
		String brindarDetalleActual = miSecretaria.brindarDetalles();
		String brindarDetalleEsperado = "Secretaria: Nombre: "+miSecretaria.getNombre()+" - Fecha de Nacimiento: "+miSecretaria.getDiaNaciemiento()+"/"+miSecretaria.getMesNaciemiento()+"/"+miSecretaria.getAnioNaciemiento()+" - Salario: "+miSecretaria.getSalario();
		
		Assert.assertEquals(brindarDetalleEsperado, brindarDetalleActual);
	
	}
	
	@Test
	public void testIngeniero() {
		Empleado miIngeniero= new Ingeniero("Carlos", 20000.0, 6, 9, 1990);
		
		String brindarDetalleActual = miIngeniero.brindarDetalles();
		String brindarDetalleEsperado = "Ingeniero: Nombre: Carlos - Fecha de Nacimiento: 6/9/1990 - Salario: 20000.0";
		
		Assert.assertEquals(brindarDetalleEsperado, brindarDetalleActual);

	}
	
	@Test
	public void testGerenteImpuesto() {
		Gerente miGerente = new Gerente("Juan", 30000.0, 1, 4, 1980);
		miGerente.setCochera(5);
		
		ManejoImpuesto manejoImpuesto = new ManejoImpuesto();
		Double impuesto = manejoImpuesto.obtenerImpuesto(miGerente);
		Double impuestoEsperado = 1500.0;
		
		Assert.assertEquals(impuestoEsperado, impuesto);
		

	}
	
	@Test
	public void testDirectorImpuesto() {
		Director miDirector= new Director("Pedro", 50000.0,3 , 7, 1979);
		miDirector.setCochera(1);
		miDirector.setSalarioPlus(2500.0);
		
		ManejoImpuesto manejoImpuesto = new ManejoImpuesto();
		Double impuesto = manejoImpuesto.obtenerImpuesto(miDirector);
		Double impuestoEsperado = 2500.0;
		
		Assert.assertEquals(impuestoEsperado, impuesto);
		
	}
	
	@Test
	public void testSecretariaImpuesto() {
		Empleado miSecretaria= new Secretaria("Maria", 15000.0, 15, 10, 1995);
		
		ManejoImpuesto manejoImpuesto = new ManejoImpuesto();
		Double impuesto = manejoImpuesto.obtenerImpuesto(miSecretaria);
		Double impuestoEsperado = 500.0;
		
		Assert.assertEquals(impuestoEsperado, impuesto);
	
	}
	
	@Test
	public void testIngenieroImpuesto() {
		Empleado miIngeniero= new Ingeniero("Carlos", 20000.0, 6, 9, 1990);
		
		ManejoImpuesto manejoImpuesto = new ManejoImpuesto();
		Double impuesto = manejoImpuesto.obtenerImpuesto(miIngeniero);
		Double impuestoEsperado = 800.0;
		
		Assert.assertEquals(impuestoEsperado, impuesto);

	}
