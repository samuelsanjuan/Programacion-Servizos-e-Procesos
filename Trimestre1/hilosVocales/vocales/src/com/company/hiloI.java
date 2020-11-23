package com.company;

public class hiloI extends Thread{

    private vocales numVocales;

    public hiloI(vocales voc) {
        numVocales=voc;
    }

    public void run(){
        numVocales.contarVocal('i','I');
    }
}