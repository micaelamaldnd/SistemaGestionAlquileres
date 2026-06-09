package ar.com.unpaz.model;

public abstract class Alquiler {
	private String id;
	private String cliente;
	private int dias;
	private int precioPorDia;

	
	public abstract double calcularCostoFinal();
	
	
	public Alquiler() {}
	
	
	public Alquiler(String id, String cliente, int dias, int precioPorDia) {
		this.id = id;
		this.cliente = cliente;
		this.dias = dias;
		this.precioPorDia = precioPorDia;
	}

	
	@Override
	public String toString() {
		return "Alquiler [id=" + id + ", cliente=" + cliente + ", dias=" + dias + ", precioPorDia=" + precioPorDia
				+ "]";
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public int getPrecioPorDia() {
		return precioPorDia;
	}
	public void setPrecioPorDia(int precioPorDia) {
		this.precioPorDia = precioPorDia;
	}
	
}
