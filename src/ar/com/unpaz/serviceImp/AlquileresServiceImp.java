package ar.com.unpaz.serviceImp;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import ar.com.unpaz.model.Alquiler;
import ar.com.unpaz.model.AlquilerPremium;
import ar.com.unpaz.service.AlquileresService;

public class AlquileresServiceImp implements AlquileresService{
	private List<Alquiler> alquileres;
	

	public AlquileresServiceImp(List<Alquiler> list) {
		this.alquileres = list;
	}

	@Override
	public void listarAlquileres() { 
		alquileres.stream()
		.forEach(a -> System.out.println(a));		
	}

	@Override
	public void listarClientes() {
		alquileres.stream()
		.forEach(a -> System.out.println(a.getCliente()));				
	}

	@Override
	public void alquilerMayorCienMil() {
		alquileres.stream()
		.filter(a -> a.calcularCostoFinal() > 100000)
		.forEach(a -> System.out.println(a));				
	}

	@Override
	public void listarClientesMAYUS() {
		alquileres.stream()
		.map(a -> a.getCliente().toUpperCase())
		.forEach(a-> System.out.println(a));
		
	}

	@Override
	public long contarAlquileresPremium() {
		long cant = alquileres.stream()
				.filter(a -> a instanceof AlquilerPremium)
				.count();
		return cant;
	}

	@Override
	public Alquiler primerAlquilerMayorCientoCincuentaMil() {
		Alquiler primerAlquiler = alquileres.stream()
				.filter(a -> a.calcularCostoFinal() > 150000)
				.findFirst()
				.orElse(null);
		return primerAlquiler;
	}

	@Override
	public boolean existeAlquilerDeUnDia() {
		boolean existe = alquileres.stream()
				.anyMatch(a -> a.getDias() == 1 );
		return existe;
	}

	@Override
	public Alquiler alquilerMasCaro() {
		Alquiler masCaro = alquileres.stream()
				.max(Comparator.comparing(a -> a.calcularCostoFinal()))
				.orElse(null);
		return masCaro;
	}

	@Override
	public Alquiler alquilerMasBarato() {
		Alquiler masBarato = alquileres.stream()
				.min(Comparator.comparing(a -> a.calcularCostoFinal()))
				.orElse(null);
		return masBarato;
	}

	@Override
	public double facturacionTotal() {
		double total = alquileres.stream()
				.mapToDouble(a -> a.calcularCostoFinal())
				.sum();
				
		return total;
	}

	@Override
	public double costoPromedio() {
		double promedio = alquileres.stream()
				.mapToDouble(a -> a.calcularCostoFinal())
				.average()
				.orElse(0); 
		return promedio;
	}

	@Override
	public void ordenarMaaMeCostoFinal() {
		alquileres.stream()
		.sorted((a1,a2) -> Double.compare(a2.calcularCostoFinal(), a1.calcularCostoFinal()))
		.forEach(a -> System.out.println(a));
	}

	@Override
	public void mostrarEco() {
		alquileres.stream()
		.filter(a -> a.calcularCostoFinal() < 50000)
		.forEach(a -> System.out.println(a));
	}

	@Override
	public void mostrarExclu() {
		alquileres.stream()
		.filter(a -> a.calcularCostoFinal() > 150000)
		.forEach(a -> System.out.println(a));
	}
		
	

	@Override
	public long contarExclu() {
		long cant = alquileres.stream()
				.filter(a -> a.calcularCostoFinal() > 150000)
				.count();
		
		return cant;
	}

	@Override
	public HashMap<String, Integer> cantAlquilerxCliente() {
		HashMap<String,Integer> mapa = new HashMap<>();

		for(Alquiler a : alquileres) {
			mapa.put(a.getCliente(), mapa.getOrDefault( a.getCliente(), 0) + 1);
		}
		return mapa;
	}

	@Override
	public String clienteMasAlquileres() {


	    HashMap<String,Integer> mapa =
	            new HashMap<>();

	    for(Alquiler a : alquileres) {

	        mapa.put(
	                a.getCliente(),
	                mapa.getOrDefault(
	                        a.getCliente(),
	                        0) + 1
	        );
	    }

	    String mejorCliente = "";
	    int max = 0;

	    for(String cliente : mapa.keySet()) {

	        if(mapa.get(cliente) > max) {

	            max = mapa.get(cliente);
	            mejorCliente = cliente;
	        }
	    }

	    return mejorCliente;
	}

	@Override
	public void reporteFinal() {
		long cant = alquileres.stream()
				.count();
		
		System.out.println("Cantidad total de alquileres: " + cant );
		System.out.println("Facturación total: " + this.facturacionTotal());
		System.out.println("Costo promedio: " + this.costoPromedio());
		System.out.println("Alquiler más caro: " + this.alquilerMasCaro());
		System.out.println("Alquiler más barato: " + this.alquilerMasBarato());
		System.out.println("Cantidad de Premium: " + this.contarAlquileresPremium());
		System.out.println("Cantidad de Exclusivos: " + this.contarExclu());
		System.out.println("Cliente con más alquileres: " + this.clienteMasAlquileres());
	}
}
