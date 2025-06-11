package TDE;

public class Livro{
    private boolean emprestado = false;
    private int idLivro;

    public Livro(int idLivro){
        this.idLivro = idLivro;
    }

    public synchronized void emprestar(int idUsuario){
        while(emprestado){
            try{
                System.out.println("Usuário " + idUsuario + " esperando livro " + idLivro + " ficar disponível");
                wait();
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        emprestado = true;
        System.out.println("Usuário " + idUsuario + " emprestou livro " + idLivro);
    }

    public synchronized void devolver(int idUsuario){
        emprestado = false;
        System.out.println("Usuário " + idUsuario + " devolveu o livro " + idLivro);
        notifyAll();
    }
}
