package com.company;

public class NumeroLetras extends Thread{

    String frase;
    int numeroLetras=0;
    public NumeroLetras(String frase){
        this.frase=frase;
    }

    public void run(){

        char[]letras=frase.toCharArray();
        for (int i=0;i<letras.length;i++){
            if (!(letras[i]==' ')){
                numeroLetras+=1;
            }
        }
    }
}
