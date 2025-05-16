package ArrayThread;

import java.util.Random;

class InicializaThread extends Thread{
    private int inicio;
    private int fim;
    private Double[] vetor;
    
    public InicializaThread(Double[] vetor, int inicio, int fim){
        this.vetor = vetor;
        this.inicio = inicio;
        this.fim = fim;
    }

    public void run(){
        Random r = new Random();

        for(int i = inicio; i < fim; i++){
            vetor[i] = r.nextDouble();
        }
    }
}

public class main {
    public static void main(String[] args) {
        Double[] vetor = new Double[2_000_000];
        InicializaThread thread1 = new InicializaThread(vetor, 0, 1_000_000);
        
        
    }
}