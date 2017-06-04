package ar.edu.unlam.pb2.empresa;

public class Secretaria extends Empleado{

	//constructor
	public Secretaria(String nombre, Double salario, Integer diaNac, Integer mesNac, Integer anioNac){
		super(nombre,salario,diaNac,mesNac,anioNac);
	}
	
	@Override
	public String brindarDetalles(){		
		return "Secretaria: Nombre: "+this.nombre+" - Fecha de Nacimiento: "+this.diaNacimiento+"/"+this.mesNacimiento+"/"+this.anioNacimiento+" - Salario: "+this.salario ;		
	}

}
