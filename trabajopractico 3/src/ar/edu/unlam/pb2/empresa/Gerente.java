package ar.edu.unlam.pb2.empresa;

public class Gerente extends Empleado{
	//atributo
	protected  Integer idCochera;
	
	//constructor
	public Gerente(String nombre, Double salario, Integer diaNac, Integer mesNac, Integer anioNac){
		super(nombre,salario,diaNac,mesNac,anioNac);
	}
	
	
	//metodos
	public void setCochera(Integer id) {
		this.idCochera = id;
	}

	public Integer getCochera() {
		return this.idCochera;
	}

	@Override
	public String toString(){		
		return "Gerente = nombre :"+this.nombre+"-FechadeNacimiento: "+this.diaNacimiento+"/"+this.mesNacimiento+"/"+this.anioNacimiento+"-salario: "+this.salario + " - cochera: " + this.idCochera;		
	}

}
