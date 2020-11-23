package com.company;

public class hiloO extends Thread{

    private vocales numVocales;

    public hiloO(vocales voc) {
        numVocales=voc;
    }

    public void run(){
        numVocales.contarVocal('o','O');
    }
}