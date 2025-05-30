package WaitNotify;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws InterruptedException{
        // 3 Produtores 2 Consumidores.
        ArrayList<Integer> fila = new ArrayList<>();

        Produtor produtor1 = new Produtor(fila);
        Produtor produtor2 = new Produtor(fila);
        Produtor produtor3 = new Produtor(fila);

        Consumidor consumidor1 = new Consumidor(fila);
        Consumidor consumidor2 = new Consumidor(fila);
    }
}