package com.bautista.dependencyinyection.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hombre extends Persona implements Comprador{
    private static final Logger log = LoggerFactory.getLogger(Hombre.class);

    public Hombre(@Value("Juan") String nombre, @Value("32") Integer edad) {
        super(nombre, edad);
    }

    @Override
    public void comprar() {
        log.info("Soy un hombre y estoy comprando");
    }
}
