package ar.edu.unlam.pb2.empresa;

public class Director extends Empleado{
	//atributo
	protected  Integer idCochera;
	protected  Double salarioPlus;
	
	
	//constructor
	public Director(String nombre, Double salario, Integer diaNac, Integer mesNac, Integer anioNac){
		super(nombre,salario,diaNac,mesNac,anioNac);
	}
	
	
	//metodos
	public void setCochera(Integer id) {
		this.idCochera = id;
	}
	
	public Integer getCochera() {
		return this.idCochera;
	}
	
	public void setSalarioPlus(Double extra) {
		this.salarioPlus = extra;
		this.salario = this.salario + extra;
	}
	
	public Double getSalarioPlus() {
		return this.salarioPlus;
	}
	
	@Override
	public String brindarDetalles(){		
		return "Director: Nombre: "+this.nombre+" - Fecha de Nacimiento: "+this.diaNacimiento+"/"+this.mesNacimiento+"/"+this.anioNacimiento+ " - Cochera: " + this.idCochera+" - Salario basico: "+(this.salario-this.salarioPlus) + " - Salario Plus: " + this.salarioPlus+ " - Salario Total: " + this.salario;		
	}


}
