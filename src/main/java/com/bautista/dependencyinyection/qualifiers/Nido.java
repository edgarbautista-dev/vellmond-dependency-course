package com.bautista.dependencyinyection.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Nido {

    private static final Logger log = LoggerFactory.getLogger(Nido.class);
    @Autowired
    @Qualifier("pajaro")
    private Animal animal;
    public void imprimir(){
        log.info("mi nido tiene un animal nombre={} ",animal.getNombre());
    }

}
