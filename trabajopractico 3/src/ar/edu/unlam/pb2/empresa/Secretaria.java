package ar.edu.unlam.pb2.empresa;

public class Secretaria extends Empleado{

	//constructor
	public Secretaria(String nombre, Double salario, Integer diaNac, Integer mesNac, Integer anioNac){
		super(nombre,salario,diaNac,mesNac,anioNac);
	}
	
	@Override
	public String toString(){		
		return "Secretaria = nombre :"+this.nombre+"-FechadeNacimiento: "+this.diaNacimiento+"/"+this.mesNacimiento+"/"+this.anioNacimiento+"-salario: "+this.salario ;		
	}

}
