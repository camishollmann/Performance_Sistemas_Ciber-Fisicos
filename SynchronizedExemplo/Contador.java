package SynchronizedExemplo;


class Contador {
    private int valor;
    public Contador();{
        this.valor = 0;
    }
    public void incrementa(){
        synchronized (this){
            this.valor++;
        }
    }
    public void decrementa(){
        synchronized (this) {
            this.valor--;
        }
    }
    public void imprime(){
        System.out.println(this.valor);
    }

}
