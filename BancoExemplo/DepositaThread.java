package BancoExemplo;

import java.util.Random;

public class DepositaThread extends Thread{
    private Conta conta;
    public DepositaThread(Conta conta){
        this.conta = conta;
    }
    public void run(){
        Random random = new Random();
        synchronized (this.conta){
            while (true){ 
                // 1. Escolhe valor aleatório.
                double valor = random.nextDouble();

                // 2. Deposita valor <- CONDIÇÃO DE CORRIDA 1 (mesma do saque).
                this.conta.deposita(valor);

                // 3. Exibe saldo.
                System.out.println("SaqueThread - Valor saque " + valor);

                // 4. Dorme
                try{
                    Thread.sleep(100);    
                } catch(InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
