package com.company;

public class PenultimaPalabra extends Thread{

    String frase;
    String penultimaPalabra;
    public PenultimaPalabra(String frase){
        this.frase=frase;
    }

    public void run(){
        String[]palabras =frase.split(" ");
        penultimaPalabra=palabras[(palabras.length-2)];
    }
}
