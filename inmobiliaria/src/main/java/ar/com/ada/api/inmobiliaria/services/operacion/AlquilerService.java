package ar.com.ada.api.inmobiliaria.services.operacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.inmobiliaria.Repo.operacion.OperacionRepository;

/**
 * AlquilerService
 */
@Service
public class AlquilerService {

    @Autowired
    OperacionRepository repoOperacion;
    
}