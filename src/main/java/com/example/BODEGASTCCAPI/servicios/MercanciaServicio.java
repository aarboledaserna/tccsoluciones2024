package com.example.BODEGASTCCAPI.servicios;

import com.example.BODEGASTCCAPI.modelos.Mercancia;
import com.example.BODEGASTCCAPI.repositorios.IMercanciaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MercanciaServicio {

    //los servicios contienen metodos asociados
    //a alguna operacion en la base de datos
    //generalmente estas asociados a uno o mas
    //repositorios

    //Inyectar una dependencia al repositorio
    @Autowired
    IMercanciaRepositorio repositorio;

    //guardar
    public Mercancia almacenarMercancia(Mercancia datosMercancia){
        return null;
    }

    //buscar todos
    public List<Mercancia> buscarTodasMercancias(){
        return null;
    }

    //buscar por id
    public Mercancia buscarMercanciaPorId(Integer idMercancia){
        return null;
    }

    //buscar nombre
    public Mercancia buscarMercanciaPorNombre(String nombreMercancia){
        return null;
    }

    //modificar
    public Mercancia modificarMercancia(Integer idMercancia, Mercancia datosMercancia){
        return null;
    }

    //eliminar
    public boolean eliminarMercancia(Integer idMercancia){
        return true;
    }




}
