package ArrayThread;
 
public class Main{
    public static void main(String[] args){
        Double[] vetor = new Double[2_000_000];
        InicializaEContaThread thread1 = new InicializaEContaThread(vetor, 0, 1_000_000);
        InicializaEContaThread thread2 = new InicializaEContaThread(vetor, 1_000_000, 2_000_000);
 
        thread1.start();

        try{
            thread1.join();
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        thread2.start();     

        try{
            thread2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Encerrou inicialização");
    }
}