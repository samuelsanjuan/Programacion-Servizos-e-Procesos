package com.company;

public class vocales {

    String texto;
    public int contadorVocales=0;

    public vocales(String texto){
        this.texto=texto;
    }

    public synchronized void añadir() {

        contadorVocales++;
        notifyAll();
    }
    public void contarVocal(char vocal, char vocalMayus){

        for (int i=0;i<texto.length();i++){

            if (texto.charAt(i)==vocal||texto.charAt(i)==vocalMayus){
                añadir();
            }
        }
    }

    public void cuantasVocales(){
        System.out.println("el numero de vocales en la frase es de :"+contadorVocales);
    }
}