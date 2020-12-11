package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc =new Scanner(System.in);
        String fraseAnalizar=sc.nextLine();

        TerceraPalabra p3=new TerceraPalabra(fraseAnalizar);
        NumeroLetras nLetras=new NumeroLetras(fraseAnalizar);
        NumeroPalabras nPalabras=new NumeroPalabras(fraseAnalizar);
        PenultimaPalabra pLast=new PenultimaPalabra(fraseAnalizar);
        MensajeCaracteresPalabras mensaje1=new MensajeCaracteresPalabras(nLetras,nPalabras);
        TerceraUltimaPalabra mensaje2=new TerceraUltimaPalabra(p3,pLast);

        p3.start();
        nLetras.start();
        nPalabras.start();
        pLast.start();

        p3.join();
        nLetras.join();
        nPalabras.join();
        pLast.join();

        mensaje1.start();
        mensaje2.start();

    }
}
