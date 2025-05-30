package BancoExemplo;

import java.util.concurrent.Semaphore;

public class Main {
    Conta conta = new Conta();
    Semaphore semaphore = new Semaphore(2, true);
    SaqueThread saqueThread1 = new SaqueThread(conta);
    SaqueThread saqueThread2 = new SaqueThread(conta);

    DepositaThread depositaThread1 = new DepositaThread(conta);
    DepositaThread depositaThread2 = new DepositaThread(conta);

}
