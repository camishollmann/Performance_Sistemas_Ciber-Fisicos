package ArrayThread;

public class ContaThread extends Thread{
    private int inicio;
    private int fim;
    private double[] vetor;
    private int contador;

    public ContaThread (int inicio, int fim, double[] vetor, int contador){
        this.inicio = inicio;
        this.fim = fim;
        this.vetor = vetor;
        this.contador = contador;
    }

    public void run(){
        for(int i = inicio; i < fim; i++){
            if((this.vetor[i] > 0.25) && (this.vetor[i] < 0.75)){
                this.contador++;
            } 
        }
    }

    public int getContador(){
        return this.contador;
    }
}
