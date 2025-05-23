package ArrayThread;

import java.util.Random;
 
public class Main{
    public static void main(String[] args){
        Double[] vetor = new Double[2_000_000];
        InicializaThread thread1 = new InicializaThread(vetor, 0, 1_000_000);
        InicializaThread thread2 = new InicializaThread(vetor, 1_000_000, 2_000_000);
        ContaThread thread3  = new ContaThread(vetor, 0, 1_000_000);
        ContaThread thread4 = new ContaThread(vetor, 1_000_000, 2_000_000);
 
        thread1.start();
        thread2.start();     


        try{
            thread1.join();
        } catch (RuntimeException e){
            throw new RuntimeException(e);
        }

        System.out.println("Encerrou inicialização");
    }
}