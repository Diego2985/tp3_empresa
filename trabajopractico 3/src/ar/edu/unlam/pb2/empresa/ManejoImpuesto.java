package ar.edu.unlam.pb2.empresa;

public class ManejoImpuesto {
	
	private final double RANGO_A=15000.0;
	private final double RANGO_B=25000.0;
	private final double RANGO_C=40000.0;
	
	private final double IMPUESTO_A=500.0;
	private final double IMPUESTO_B=800.0;
	private final double IMPUESTO_C=1500.0;
	private final double IMPUESTO_D=2500.0;
	
	public ManejoImpuesto(){
		super();
	}
	 
	public Double calcularImpuesto(Empleado data) {
		
		double salario = data.salario;
		
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
	

}
