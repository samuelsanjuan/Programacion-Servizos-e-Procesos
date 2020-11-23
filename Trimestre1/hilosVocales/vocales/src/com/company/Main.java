package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("mete la frase de la que quieras saber las vocales");
        Scanner sc= new Scanner(System.in);
        String fraseAnalizar=sc.nextLine();
        System.out.println(" ");

        vocales numeroDeVocales=new vocales(fraseAnalizar);

        hiloA numeroA=new hiloA(numeroDeVocales);
        hiloE numeroE=new hiloE(numeroDeVocales);
        hiloI numeroI=new hiloI(numeroDeVocales);
        hiloO numeroO=new hiloO(numeroDeVocales);
        hiloU numeroU=new hiloU(numeroDeVocales);

        numeroA.run();
        numeroE.run();
        numeroI.run();
        numeroO.run();
        numeroU.run();

        numeroDeVocales.cuantasVocales();
    }
}
