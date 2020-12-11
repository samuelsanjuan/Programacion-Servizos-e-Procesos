package com.company;

public class TerceraUltimaPalabra extends Thread{

    TerceraPalabra p3;
    PenultimaPalabra penultima;

    public TerceraUltimaPalabra(TerceraPalabra p3,PenultimaPalabra penultima){

        this.p3=p3;
        this.penultima=penultima;

    }

    public void run() {
        System.out.println("La tercera palabra es "+p3.palabra3+" y la penultima palabra es "+penultima.penultimaPalabra);
    }
}
