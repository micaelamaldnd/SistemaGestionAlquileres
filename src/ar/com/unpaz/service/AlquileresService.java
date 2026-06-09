package ar.com.unpaz.service;

import java.util.HashMap;

import ar.com.unpaz.model.Alquiler;

public interface AlquileresService {

    void listarAlquileres();

    void listarClientes();

    void alquilerMayorCienMil();

    void listarClientesMAYUS();

    long contarAlquileresPremium();

    Alquiler primerAlquilerMayorCientoCincuentaMil();

    boolean existeAlquilerDeUnDia();

    Alquiler alquilerMasCaro();

    Alquiler alquilerMasBarato();

    double facturacionTotal();

    double costoPromedio();

    void ordenarMaaMeCostoFinal();

    void mostrarEco();

    void mostrarExclu();

    long contarExclu();

    HashMap<String,Integer> cantAlquilerxCliente();

    String clienteMasAlquileres();

    void reporteFinal();
}
