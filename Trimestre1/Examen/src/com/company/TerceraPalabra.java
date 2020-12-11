package com.company;

public class TerceraPalabra extends Thread{

    String frase;
    String palabra3;
    public TerceraPalabra(String frase){
        this.frase=frase;
    }

    public void run(){
        String[]palabras =frase.split(" ");
        palabra3=palabras[2];
    }

}
