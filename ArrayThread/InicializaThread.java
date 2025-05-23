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