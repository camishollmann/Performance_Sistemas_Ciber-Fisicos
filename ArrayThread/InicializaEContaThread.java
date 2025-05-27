import java.util.Random;

class InicializaEContaThread extends Thread{
    private int inicio;
    private int fim;
    private Double[] vetor;
    
    public InicializaEContaThread(Double[] vetor, int inicio, int fim){
        this.vetor = vetor;        
        this.inicio = inicio;
        this.fim = fim;
    }

    public void run(){
        Random r = new Random();
        int contador = 0;

        for(int i = inicio; i < fim; i++){
            vetor[i] = r.nextDouble();
            if ((vetor[i] > 0.25) && (vetor[i] < 0.75)){
                contador++;
            } 
        }
    }
}