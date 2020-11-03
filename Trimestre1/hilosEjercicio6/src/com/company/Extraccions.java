package com.company;

class Extraccions extends Thread {
    private Caja cubbyhole;



    public Extraccions(Caja c) {
        cubbyhole = c;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {

            //int extraccion=500;
            int extraccion=(int) (500*Math.random());
            cubbyhole.extraccion(extraccion);
            System.out.println("has hecho tu "+(i+1)+"ª extraccion gastando " + extraccion+ " te quedan "+ cubbyhole.capital);


        }
    }
}