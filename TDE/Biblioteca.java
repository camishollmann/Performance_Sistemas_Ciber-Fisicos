package TDE;

public class Biblioteca{
    public static void main(String[] args){
        int totalLivros = 10;
        Livro[] livros = new Livro[totalLivros];

        for(int i = 0; i < totalLivros; i++){
            livros[i] = new Livro(i);
        }

        Usuario usuario1 = new Usuario(1, livros);
        Usuario usuario2 = new Usuario(2, livros);
        Usuario usuario3 = new Usuario(3, livros);

        usuario1.start();
        usuario2.start();
        usuario3.start();
    }
}