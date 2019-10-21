package ar.com.ada.api.inmobiliaria.services.inmobiliaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import ar.com.ada.api.inmobiliaria.Repo.inmobiliaria.InmobiliariaRepository;
import ar.com.ada.api.inmobiliaria.entities.inmobiliaria.Inmobiliaria;
=======
import ar.com.ada.api.inmobiliaria.repositorys.inmobiliaria.InmobiliariaRepository;
>>>>>>> f0de238aedadcc25b35105fc61cce6382b295fbb

/**
 * InmobiliariaService
 */
@Service

public class InmobiliariaService {

    @Autowired
    InmobiliariaRepository repo;

   public void save(Inmobiliaria i) {
        repo.save(i);
    }

    public Inmobiliaria crearInmobiliaria (String nombre, String direccion, String cuit){
        
        Inmobiliaria i = new Inmobiliaria();
        i.setNombre(nombre);
        i.setDireccion(direccion);
        i.setCuit(cuit);

        repo.save(i);
        return i;
    }
}