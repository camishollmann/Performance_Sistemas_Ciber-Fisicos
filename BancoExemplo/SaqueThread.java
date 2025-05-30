package BancoExemplo;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class SaqueThread {
    private Conta conta;
    public SaqueThread(Conta conta){
        this.conta = conta;
    }
    public void run(){
        // 1. Escolhe valor aleatório.
        Random random = new Random();

        while (true) { 
            double valor = random.nextDouble();

            try {
                semaphore.acquire();
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            // 2. Verifica saldo. <- CONDIÇÃO DE CORRIDA 1.
            if(this.conta.getSaldo() >= valor){
                // 3. Realiza saque. <- MESMA CONDIÇÃO DE CORRIDA QUE A VERIFICAÇÃO.
                this.conta.saque(valor);
            }
            System.out.println("SaqueThread - Valor saque: " + valor + " saldo: " + this.conta.getSaldo());
            semaphore.release();
            // 4. Dorme
            try{
                Thread.sleep(100);    
            } catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }        
}

