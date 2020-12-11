package com.company;

public class NumeroPalabras extends Thread{

    String frase;
    int numeroPalabras;

    public NumeroPalabras(String frase){
        this.frase=frase;
    }

    public void run(){
        String[]palabras =frase.split(" ");
        numeroPalabras=palabras.length;
    }

}