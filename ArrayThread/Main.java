package ArrayThread;
 
public class Main{
    public static void main(String[] args){
        Double[] vetor = new Double[200_000_000];

        InicializaThread thread1 = new InicializaThread(vetor, 0, 1_000_000);
        InicializaThread thread2 = new InicializaThread(vetor, 1_000_000, 2_000_000);

        ContaThread thread3 = new ContaThread(0, 100_000_00, vetor, 0);
        ContaThread thread4 = new ContaThread(100_000_000, 200_000_000, vetor, 0);

        thread1.start();
        thread2.start();     

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            System.out.println("Erro ao inicializar.");
        }

        System.out.println("Encerrou inicialização");

        thread3.start();
        thread4.start();

        try{
            thread3.join();
            thread4.join();
        } catch (InterruptedException e){
            System.out.println("Erro ao contar.");
        }
        
        int contaTotal = thread3.getContador() + thread4.getContador();

        System.out.println("Total de valores entre 0.25 e 0.75: " + contaTotal);
    }
}