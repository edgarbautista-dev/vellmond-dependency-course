package com.bautista.dependencyinyection.inyection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Coche {
    // @Value("Mazda") para settear el valor por atributo
    private String marca;
    // @Value("2022") para settear el valor por atributo
    private Integer modelo;

    private Motor motor;

    public String getMarca() {
        return marca;
    }

    @Value("mazda")
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    @Value("2022")
    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }
    @Autowired
    public void setMotor(Motor motor) {
        this.motor = motor;
    }


    /*public Coche( String marca,  Integer modelo,  Motor motor) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
*/
    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor=" + motor +
                '}';
    }


}
