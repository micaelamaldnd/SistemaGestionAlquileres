package ar.com.unpaz.serviceImp;

import java.util.List;

import ar.com.unpaz.model.Alquiler;
import ar.com.unpaz.repo.LecturaArchivoRepo;
import ar.com.unpaz.repoImp.*;
import ar.com.unpaz.service.LecturaArchivoService;

public class LecturaArchivoServiceImp  implements LecturaArchivoService{
	private LecturaArchivoRepo repo = new LecturaArchivoRepoImp();

	@Override
	public List<Alquiler> listaAlquileres() {
		List<Alquiler> alquileres = repo.obtenerAlquileres();
		return alquileres ;
	}
	

}
