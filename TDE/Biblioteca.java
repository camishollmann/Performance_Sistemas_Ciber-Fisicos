package TDE;

public class Biblioteca{
    public static void main(String[] args){
        int totalLivros = 10;
        Livro[] livros = new Livro[totalLivros];

        Usuario usuario1 = new Usuario(1);
        Usuario usuario2 = new Usuario(2);
        Usuario usuario3 = new Usuario(3);

        for(int i = 0; i < totalLivros; i++){
            livros[i] = new Livro(i);
        }
    }
}