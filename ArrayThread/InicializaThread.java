package ArrayThread;

import java.util.Random;

class InicializaThread extends Thread{
    private int inicio;
    private int fim;
    private Double[] vetor;
    // private int contador;
    
    public InicializaThread(Double[] vetor, int inicio, int fim){
        this.vetor = vetor;        
        this.inicio = inicio;
        this.fim = fim;
        // this.contador = 0;
    }

    public void run(){
        Random r = new Random(01);

        for(int i = inicio; i < fim; i++){
            vetor[i] = r.nextDouble();
        }
    }

    // public int getContador(){
    //     return contador;
    // }
}