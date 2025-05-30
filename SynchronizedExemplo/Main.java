package SynchronizedExemplo;

public class Main {
    public static void main(String[] args){
        Contador contador = new Contador();

        ContaThread contaThread1 = new ContaThread(contador);
        ContaThread contaThread2 = new ContaThread(contador);

        contaThread1.start();
        contaThread2.start();

        contaThread1.join();
        contaThread2.join();

    }
}