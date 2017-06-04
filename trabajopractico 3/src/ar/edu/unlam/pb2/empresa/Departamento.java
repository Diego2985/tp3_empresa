package ar.edu.unlam.pb2.empresa;

public class Departamento {
	/*El organigrama de la empresa, determina que está organizada en diferentes

	departamentos, siendo que cada departamento está administrado por un

	gerente*/
	
	private Empleado gerente;
	
	

	public Empleado getGerente() {
		return gerente;
	}

	public void setGerente(Empleado gerente) {
		this.gerente = gerente;
	}

}
