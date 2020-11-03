package com.company;

public class Main extends Thread{
    public Main (String str){
        super(str);
    }
    @Override
    public void run () {

        Main owo=new Main("owo");
        Main uwu=new Main("uwu");
        Main sech=new Main("sech");
        Main juan=new Main("juan");

        switch(getName()){

            case "pepe":{

                owo.start();
                break;
            }
            case "owo":{

                uwu.start();
                break;
            }
            case "uwu":{

                sech.start();
                break;
            }
            case "sech":{

                juan.start();
                break;
            }
            case "juan":{
                break;
            }
            default:

        }

        long numRandom=(long)(Math.random()*600);

        for (int i=0;i<6;i++){
            System.out.println(i + " " + getName());
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

        try {
            pepe.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("adios");


    }
}