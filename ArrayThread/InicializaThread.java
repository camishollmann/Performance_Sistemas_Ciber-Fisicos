package ArrayThread;

import java.util.Random;

class InicializaThread extends Thread{
    private int inicio;
    private int fim;
    private double[] vetor;
    
    public InicializaThread(double[] vetor, int inicio, int fim){
        this.vetor = vetor;        
        this.inicio = inicio;
        this.fim = fim;
    }

    public void run(){
        Random r = new Random(01);

        for(int i = inicio; i < fim; i++){
            vetor[i] = r.nextDouble();
        }
    }

}