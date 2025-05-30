package SynchronizedExemplo;

class ContaThread extends Thread{
    private Contador contador;
    public ContaThread(Contador contador){
        this.contador = contador;
    }
    public void run(){
        for(int i = 0; i < 10_000; i++){
            this.contador.incrementa();
        }
    }
}