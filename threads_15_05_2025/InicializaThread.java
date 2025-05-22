public class InicializaThread extends Thread {
    private int inicio;
    private int fim;
    private Double[] vetor;
    
    public InicializaThread(Double[] vetor, int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
        this.vetor = vetor; 
    }

    public void run() {
        Random rand = new Random();

        for(int i = 0; i< this.fim; i++) {
            this.vetor[i] = rand.nexDouble();
        }
    }
}
