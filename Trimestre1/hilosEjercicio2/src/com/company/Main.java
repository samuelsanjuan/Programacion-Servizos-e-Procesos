package com.company;

public class Main extends Thread{
    public Main (String str){
        super(str);
    }
    @Override
    public void run () {
        long numRandom=(long)(Math.random()*600);
        int n=0;
        while (n!=6) {
            System.out.println(n + " " + getName());
            n++;
            try {
                sleep(numRandom);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("el hilo "+getName()+" acaba");
    }

    public static void main(String[] args) {

        Thread pepe= new Main("pepe");
        pepe.start();
        Thread juan= new Main("juan");
        juan.start();
        Thread sech= new Main("sech");
        sech.start();
        Thread uwu= new Main("uwu");
        uwu.start();


        while((uwu.isAlive()||sech.isAlive()||juan.isAlive()||pepe.isAlive())){

        }
        System.out.println("adios");
    }
}