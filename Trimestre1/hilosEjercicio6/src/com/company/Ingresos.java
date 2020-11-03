package com.company;

class Ingresos extends Thread {
    private Caja cubbyhole;


    public Ingresos(Caja c) {
        cubbyhole = c;
    }

    public void run() {

        for (int i = 0; i < 10; i++) {

            try {
                sleep((int)(Math.random() * 2000));
            } catch (InterruptedException e) {
            }
            //int ingreso=250;
            int ingreso=(int) (250*Math.random());
            cubbyhole.ingreso(ingreso);
            System.out.println("un cliente ha hecho su "+(i+1)+"ª compra y ha gastado "+ingreso+" en tu tienda, ahora tienes "+ cubbyhole.capital);


        }
    }
}