package ar.com.unpaz.model;

public class AlquilerComun extends Alquiler {
	
	public AlquilerComun() {
		// TODO Auto-generated constructor stub
		super();
	}

	public AlquilerComun(String id, String cliente, int dias, int precioPorDia) {
		super(id, cliente, dias, precioPorDia); 
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularCostoFinal() {
		return getDias() * getPrecioPorDia();
	}

	@Override
	public String toString() {
		return "Alquiler Comun ->" + super.toString() ;
	}



	

}
