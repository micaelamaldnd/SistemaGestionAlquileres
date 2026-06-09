package ar.com.unpaz.model;

public class AlquilerPremium extends Alquiler {

	public AlquilerPremium() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AlquilerPremium(String id, String cliente, int dias, int precioPorDia) {
		super(id, cliente, dias, precioPorDia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularCostoFinal() {
		return (getDias() * getPrecioPorDia()) * 1.15;
	}

	@Override
	public String toString() {
		return "Alquiler Premium ->" + super.toString();
	}
	
	

}
