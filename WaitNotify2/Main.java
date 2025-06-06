package WaitNotify2;

import java.util.ArrayList;
import java.util.Random;
 
class Produtor extends Thread {
    private ArrayList<Integer> lista;
    private int id;
    public Produtor(int id, ArrayList<Integer> lista){
        this.id = id;
        this.lista = lista;
    }
    public void run(){
        Random random = new Random();
        while (true){
            int dado = random.nextInt(1000);
            synchronized (this.lista){
                while (this.lista.size() >= 5){
                    try {
                        this.lista.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                this.lista.add(dado);
                this.lista.notifyAll();
                System.out.println("Produtor " +
                        this.id + " " +
                        this.lista);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
 
class Consumidor extends Thread {
    private ArrayList<Integer> lista;
    private int id;
    public Consumidor(int id, ArrayList<Integer> lista){
        this.id = id;
        this.lista = lista;
    }
    public void run(){
 
    }
}
 
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> lista = new ArrayList<>();
        Consumidor consumidor = new Consumidor(1, lista);
        Produtor produtor1 = new Produtor(1, lista);
        Produtor produtor2 = new Produtor(2, lista);
        Produtor produtor3 = new Produtor(3, lista);
        consumidor.start();
        produtor1.start();
        produtor2.start();
        produtor3.start();
    }
}
 

     

