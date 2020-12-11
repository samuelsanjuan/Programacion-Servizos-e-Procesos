package com.company;

public class MensajeCaracteresPalabras extends Thread{

    NumeroLetras nl;
    NumeroPalabras np;

    public MensajeCaracteresPalabras(NumeroLetras nl,NumeroPalabras np){

        this.nl=nl;
        this.np=np;

    }

    public void run() {
        System.out.println("El numero total de caracteres es "+nl.numeroLetras+" y el numero total de palabras es "+np.numeroPalabras);
    }
}
