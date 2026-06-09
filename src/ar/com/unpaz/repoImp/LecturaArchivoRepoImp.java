package ar.com.unpaz.repoImp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.model.Alquiler;
import ar.com.unpaz.model.AlquilerComun;
import ar.com.unpaz.model.AlquilerPremium;
import ar.com.unpaz.repo.LecturaArchivoRepo;

public class LecturaArchivoRepoImp implements LecturaArchivoRepo{

	@Override
	public List<Alquiler> obtenerAlquileres() {
		List <Alquiler> alquileres = new ArrayList<>();
		File sfile = new File("alquileres.txt");
		FileReader sFileReader;
		try {
			sFileReader = new FileReader(sfile);
			BufferedReader sbuffer = new BufferedReader (sFileReader);
			String linea = "";
			while((linea = sbuffer.readLine())!= null) {
				String [] array = linea.split(";");
				String id = array[0];
				String cliente = array[2];
				int dias = Integer.parseInt(array[3]);
				int precio = Integer.parseInt(array[4]);
				String tipo = array[1];
				
				if (tipo.equalsIgnoreCase("COMUN")) {
					AlquilerComun nuevoAC = new AlquilerComun(id, cliente, dias, precio);
					alquileres.add(nuevoAC); 
				} 
				
				if(tipo.equalsIgnoreCase("PREMIUM")) {
					AlquilerPremium nuevoAP = new AlquilerPremium(id, cliente, dias, precio);
					alquileres.add(nuevoAP); 
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return alquileres;
	}
	

}
