package com.company;

public class hiloE extends Thread{

    private vocales numVocales;

    public hiloE(vocales voc) {
        numVocales=voc;
    }

    public void run() { numVocales.contarVocal('e','E'); }
}