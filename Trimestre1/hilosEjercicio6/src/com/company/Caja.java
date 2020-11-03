package com.company;

class Caja {
    public int capital=500;

    public synchronized void ingreso(int value) {

        capital=capital+value;

        notify();
    }

    public synchronized void extraccion(int value) {

        if ((capital-value)<0){
            System.out.println("te has quedado sin dinero espera a que venga un cliente para poder pagar");
        }
        while ((capital-value)<0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }capital=capital-value;
        notify();
    }
}