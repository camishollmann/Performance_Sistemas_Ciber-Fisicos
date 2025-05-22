package ArrayThread;

import java.util.Random;

class InicializaThread extends Thread {
    private int inicio;
    private int fim;
    private Double[] vetor;
    
    public InicializaThread(Double[] vetor, int inicio, int fim){
        this.vetor = vetor;
        this.inicio = inicio;
        this.fim = fim;
    }

    public void run(){
        Random r = new Random(1);

        for(int i = inicio; i < this.fim; i++){
            this.vetor[i] = r.nextDouble();
        }
    }
}

class ContaThread extends Thread{
    private int contaNumeros = 0;
    private int inicio;
    private int fim;
    private Double[] vetor;


    for(int i = inicio; i < fim; i++){
        if ((this.vetor[i] > 0.25) && (this.vetor[i] < 0.75)){
            contaNumeros++;
        }
    }
}

public class Exemplo {
    public static void main(String[] args){
        Double[] vetor = new Double[2_000_000];
        Thread thread1 = new Thread("thread 1");
        InicializaThread thread2 = new InicializaThread(vetor, 1_000_000, 2_000_000);

        thread1.start();
        thread2.start();     

        thread1.InicializaThread(vetor, 0, 1_000_000_000);

        try{
            thread1.join();
        } catch (RuntimeException e){
            throw new RuntimeException(e);
        }

        System.out.println("Encerrou inicialização");
    }
}