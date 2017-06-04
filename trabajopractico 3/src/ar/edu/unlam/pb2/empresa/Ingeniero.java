package ar.edu.unlam.pb2.empresa;

public class Ingeniero extends Empleado{

	//constructor
	public Ingeniero(String nombre, Double salario, Integer diaNac, Integer mesNac, Integer anioNac){
		super(nombre,salario,diaNac,mesNac,anioNac);
	}
	
	@Override
	public String toString(){		
		return "Ingeniero = nombre :"+this.nombre+"-FechadeNacimiento: "+this.diaNacimiento+"/"+this.mesNacimiento+"/"+this.anioNacimiento+"-salario: "+this.salario ;		
	}
}
