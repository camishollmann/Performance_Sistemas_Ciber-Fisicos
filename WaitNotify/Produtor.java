package WaitNotify;

import java.util.ArrayList;
import java.util.Random;

public class Produtor extends Thread{
    private ArrayList<Integer> fila;
    private int dado;

    public Produtor(ArrayList<Integer> fila){
        this.fila = fila;
    }

    public void run(){
        synchronized (fila){
            System.out.println("Começo produtor");
        }
        Random random = new Random()
        dado = random.nextInt();
        fila.add(dado);

        try{
            Thread.sleep(5000);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
