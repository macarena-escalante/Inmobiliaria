package ar.com.ada.api.inmobiliaria.controllers.amenitie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.inmobiliaria.services.amenitie.AmenitieService;

/**
 * AmenitieController
 */
@RestController
public class AmenitieController {

    @Autowired
    AmenitieService amenitieService;
    
    
}