package ar.com.unpaz.inicio;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import ar.com.unpaz.model.Alquiler;
import ar.com.unpaz.service.AlquileresService;
import ar.com.unpaz.service.LecturaArchivoService;
import ar.com.unpaz.serviceImp.AlquileresServiceImp;
import ar.com.unpaz.serviceImp.LecturaArchivoServiceImp;

public class Main {

	public static void main(String[] args) {
		LecturaArchivoService listaDeLaLectura = new LecturaArchivoServiceImp();
		List <Alquiler> alquileres = listaDeLaLectura.listaAlquileres();
		AlquileresService service = new AlquileresServiceImp(alquileres);
		Scanner scanner = new Scanner(System.in);
		
		int opcion;

		do {

		    System.out.println("\n------ SISTEMA DE ALQUILERES ------\n");

		    System.out.println("1. Listar Alquileres");
		    System.out.println("2. Listar Clientes");
		    System.out.println("3. Alquileres mayores a $100.000");
		    System.out.println("4. Clientes en MAYÚSCULAS");
		    System.out.println("5. Contar Alquileres Premium");
		    System.out.println("6. Primer alquiler mayor a $150.000");
		    System.out.println("7. Existe alquiler de un día");
		    System.out.println("8. Alquiler más caro");
		    System.out.println("9. Alquiler más barato");
		    System.out.println("10. Facturación total");
		    System.out.println("11. Costo promedio");
		    System.out.println("12. Ordenar de mayor a menor costo");
		    System.out.println("13. Mostrar Económicos");
		    System.out.println("14. Mostrar Exclusivos");
		    System.out.println("15. Contar Exclusivos");
		    System.out.println("16. Cantidad de alquileres por cliente");
		    System.out.println("17. Cliente con más alquileres");
		    System.out.println("18. Reporte Final");
		    System.out.println("19. Salir");
		    System.out.println("Seleccione una opcion: ");

		    opcion = scanner.nextInt();
		    scanner.nextLine();

		    switch(opcion) {

		        case 1:
		            service.listarAlquileres();
		            break;

		        case 2:
		            service.listarClientes();
		            break;

		        case 3:
		            service.alquilerMayorCienMil();
		            break;

		        case 4:
		            service.listarClientesMAYUS();
		            break;

		        case 5:
		            System.out.println("\nCantidad de alquileres premium: " +
		                    service.contarAlquileresPremium());
		            break;

		        case 6:
		        	if (service.primerAlquilerMayorCientoCincuentaMil() != null) {
		        		System.out.println("El siguiente alquiler es el primero que tiene un costo total superior a $150.000 : " + 
		                    service.primerAlquilerMayorCientoCincuentaMil());
		        	} else {
		        		System.out.println("No existe ningun alquiler superior a $150.000");
		        	}
		            break;

		        case 7:
		        	if (service.existeAlquilerDeUnDia()) {
		        		System.out.println("Si, existe un alquiler de un dia.");
		        	} else {System.out.println("No existe ningun alquiler de un dia");}
		            break;

		        case 8:
		            System.out.println(
		                    service.alquilerMasCaro());
		            break;

		        case 9:
		            System.out.println(
		                    service.alquilerMasBarato());
		            break;

		        case 10:
		            System.out.println(
		                    service.facturacionTotal());
		            break;

		        case 11:
		            System.out.println(
		                    service.costoPromedio());
		            break;

		        case 12:
		            service.ordenarMaaMeCostoFinal();
		            break;

		        case 13:
		            service.mostrarEco();
		            break;

		        case 14:
		            service.mostrarExclu();
		            break;

		        case 15:
		            System.out.println(
		                    service.contarExclu());
		            break;

		        case 16:
		        	HashMap<String,Integer> mapa =  service.cantAlquilerxCliente();
		        	mapa.forEach((cliente,cantidad) -> System.out.println( cliente + " realizó " + cantidad +" alquiler/es"));
		            break;

		        case 17:
		            System.out.println(
		                    service.clienteMasAlquileres());
		            break;

		        case 18:
		        	System.out.println("\n--- Reporte Final ---\n");
		            service.reporteFinal();
		            break;

		        case 19:
		            System.out.println("Saliendo...");
		            break;

		        default:
		            System.out.println("Opción inválida");
		    }

		} while(opcion != 19);
			
		scanner.close();
		
	}

}
