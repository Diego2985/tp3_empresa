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
	}
	
	public Double getSalarioPlus() {
		return this.salarioPlus;
	}
	
	@Override
	public String toString(){		
		return "Director = nombre :"+this.nombre+"-FechadeNacimiento: "+this.diaNacimiento+"/"+this.mesNacimiento+"/"+this.anioNacimiento+"-salario: "+this.salario + " - cochera: " + this.idCochera+ " - salarioPlus: " + this.salarioPlus;		
	}

}
