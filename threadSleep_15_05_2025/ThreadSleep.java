package threadSleep_15_05_2025;

class MinhaThread extends Thread {
    String nome;
    long start = System.currentTimeMillis();

    public void run() {
        for (int i = 0; i < 1000; i++){
            System.out.println("Bem-vindo!");

            try {
                Thread.sleep(5000);
            } catch(InterruptedException e){
                throw new RuntimeException(e);
            }

            System.out.println("Adeus");
        }
    }
}

public class ThreadSleep {
    public static void main(String[] args) {
        Thread thread1 = new Thread("thread 1: ");

        thread1.run();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Fim do programa");
    }
}