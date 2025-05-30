package WaitNotify;

import java.util.ArrayList;

public class Consumidor extends Thread{
    private ArrayList<Integer> fila;

    public Consumidor(ArrayList<Integer> fila){
        this.fila = fila;
    }

    public void run(){
        synchronized (fila){
            System.out.println("Começo consumidor");
        }
        try{
            Thread.sleep(5000);
        } catch (Exception e){
            throw new RuntimeException(e);
        }    
    }

}
