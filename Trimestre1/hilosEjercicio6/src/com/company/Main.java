package com.company;

public class Main {

    public static void main(String[] args) {

        Caja caja = new Caja();
        Ingresos ingresos1 = new Ingresos(caja);
        Extraccions extraccions1 = new Extraccions(caja);

        ingresos1.start();
        extraccions1.start();
    }
}


