package com.company;

public class hiloU extends Thread{

    private vocales numVocales;

    public hiloU(vocales voc) { numVocales=voc; }

    public void run(){
        numVocales.contarVocal('u','U');
    }
}