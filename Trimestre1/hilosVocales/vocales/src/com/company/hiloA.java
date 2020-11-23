package com.company;

public class hiloA extends Thread{

    private vocales numVocales;

    public hiloA(vocales voc) {
        numVocales=voc;
    }

    public void run(){
        numVocales.contarVocal('a','A');
    }
}
