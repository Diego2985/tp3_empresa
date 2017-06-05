package ar.edu.unlam.pb2.empresa;

public class ManejoImpuesto {
	
	private final Double RANGO_A=15000.0;
	private final Double RANGO_B=25000.0;
	private final Double RANGO_C=40000.0;
	
	private final Double IMPUESTO_A=500.0;
	private final Double IMPUESTO_B=800.0;
	private final Double IMPUESTO_C=1500.0;
	private final Double IMPUESTO_D=2500.0;
	
	public Double obtenerImpuesto(Empleado data) {
		
		Double salario = data.salario;
		
		if (salario <= RANGO_A) {
			return IMPUESTO_A;
		} else if (salario <= RANGO_B ) {
			return IMPUESTO_B;
		} else if (salario <= RANGO_C ) {
			return IMPUESTO_C;
		} else {
			return IMPUESTO_D;
		}
		
	}
	 
	public Double calcularImpuesto(Empleado data) {
		
		Double salario = data.salario;
		
		if (salario <= RANGO_A) {
			return salario - IMPUESTO_A;
		} else if (salario <= RANGO_B ) {
			return salario - IMPUESTO_B;
		} else if (salario <= RANGO_C ) {
			return salario - IMPUESTO_C;
		} else {
			return salario - IMPUESTO_D;
		}
		
	}
	

}
