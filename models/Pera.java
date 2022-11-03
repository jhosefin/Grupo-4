package com.generation.firstproject.models;

public class Pera extends Frutas{


    Integer cantAgua;

    public Pera() {
        super();
    }

    public Pera(String sabor, Integer semillas, String colores, Float peso, String cascara, String tamanio, Integer cantAgua) {
        super(sabor, semillas, colores, peso, cascara, tamanio);
        this.cantAgua = cantAgua;
    }

    public Integer getCantAgua() {
        return cantAgua;
    }

    public void setCantAgua(Integer cantAgua) {
        this.cantAgua = cantAgua;
    }

    @Override
    public String toString() {
        return super.toString() + "Pera [cantAgua=" + cantAgua + "]";
    }

    
    
}
