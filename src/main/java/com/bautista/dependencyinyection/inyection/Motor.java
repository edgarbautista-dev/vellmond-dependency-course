package com.bautista.dependencyinyection.inyection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class Motor {
    // @Value("3") para settear el valor a nivel de atributo
    private String marca;
    // @Value("2021") para settear el valor a nivel de atributo
    private Integer modelo;

    @Override
    public String toString() {
        return "Motor{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                '}';
    }
    public Motor(){

    }

/*    public Motor( String marca, Integer modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }*/


    public String getMarca() {
        return marca;
    }

    @Value("3")
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    @Value("2021")
    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

}
