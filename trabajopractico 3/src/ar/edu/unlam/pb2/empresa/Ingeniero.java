package ar.edu.unlam.pb2.empresa;

public class Ingeniero extends Empleado{

	//constructor
	public Ingeniero(String nombre, Double salario, Integer diaNac, Integer mesNac, Integer anioNac){
		super(nombre,salario,diaNac,mesNac,anioNac);
	}
	
	@Override
	public String brindarDetalles(){		
		return "Ingeniero: Nombre: "+this.nombre+" - Fecha de Nacimiento: "+this.diaNacimiento+"/"+this.mesNacimiento+"/"+this.anioNacimiento+" - Salario: "+this.salario ;		
	}
}
