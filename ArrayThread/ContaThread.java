class ContaThread extends Thread{
    private int contaNumeros = 0;
    private int inicio;
    private int fim;
    private Double[] vetor;

    public ContaThread(int contaNumeros, int inicio, int fim, Double[] vetor){
        this.contaNumeros = contaNumeros;
        this.inicio = inicio;
        this.fim = fim;
        this.vetor = vetor;
    }

    public void run(){
        for(int i = inicio; i < fim; i++){
            if ((this.vetor[i] > 0.25) && (this.vetor[i] < 0.75)){
                contaNumeros++;
            }
        }
    }
}