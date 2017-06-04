package ar.edu.unlam.pb2.empresa;

public class Empleado {

	//atributos
	protected  String nombre;
	protected  Double salario;
	protected  Integer diaNacimiento;
	protected  Integer mesNacimiento;
	protected  Integer anioNacimiento;

	//constructor
	public Empleado(String nombre, Double salario, Integer diaNac, Integer mesNac, Integer anioNac){
		this.nombre=nombre;
		this.salario=salario;
		this.diaNacimiento = diaNac;
		this.mesNacimiento = mesNac;
		this.anioNacimiento = anioNac;
	}

	//metodos
	public String brindarDetalles(){		
		return "Empleado: Nombre :"+this.nombre+" - Fecha de Nacimiento: "+this.diaNacimiento+"/"+this.mesNacimiento+"/"+this.anioNacimiento+" - Salario: "+this.salario;		
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return this.nombre;
	}

	public void setDiaNacimiento( Integer dia){
		this.diaNacimiento=dia;
	}
	public Integer getDiaNaciemiento(){
		return this.diaNacimiento;
	}
	public void setMesNacimiento( Integer mes){
		this.mesNacimiento=mes;
	}
	public Integer getMesNaciemiento(){
		return this.mesNacimiento;
	}

	public void setAnioNacimiento( Integer anio){
		this.anioNacimiento=anio;
	}
	public Integer getAnioNaciemiento(){
		return this.anioNacimiento;
	}
	public void setSalario( Double salario){
		this.salario=salario;
	}
	public Double getSalario(){
		return this.salario;
	}
}
