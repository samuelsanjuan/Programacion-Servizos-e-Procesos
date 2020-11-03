package com.company;

public class Main extends Thread{

    public Main (String str){

        super(str);

    }

    @Override
    public void run() {

        double random= Math.random();
        long contador= (long) (random*1000);
        int n=0;
        while (n!=10) {
            System.out.println(n + " " + getName());
            n++;
            try {
                sleep(contador);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("el hilo "+getName()+" acaba");

    }

    public static void main(String[] args) {
        System.out.println("hola");
        new Main("pepe").start();

        new Main("sech").start();

        System.out.println("adios");



    }


}
