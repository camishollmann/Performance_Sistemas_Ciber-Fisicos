package TDE;

import java.util.Random;

public class Usuario extends Thread{
    private int idUsuario;
    Random r = new Random();

    public Usuario(int idUsuario){
        this.idUsuario = idUsuario;
    }

    public void run(){
        while (true){
            int livroEscolhido = r.nextInt(10);
            Livro livro = livros[livroEscolhido];

            livro.emprestar(idUsuario);

            try{
                Thread.sleep(1000 + r.nextInt(1000));
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }

            livro.devolver(idUsuario);

            try{
                Thread.sleep(1000 + r.nextInt(1000));
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
