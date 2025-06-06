import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RA2AtivMultithread {

    public static void main(String[] args) {
        long inicio = System.nanoTime();

        String caminhoDiretorio = "C:\\Users\\maria\\Downloads\\amostra\\amostra";

        File diretorio = new File(caminhoDiretorio);
        if (!diretorio.exists() || !diretorio.isDirectory()) {
            System.out.println("Diretório inválido.");
            return;
        }

        int[] contagemLetras = new int[26];

        File[] arquivos = diretorio.listFiles((dir, nome) -> nome.toLowerCase().endsWith(".txt"));

        if (arquivos == null || arquivos.length == 0) {
            System.out.println("Nenhum arquivo .txt encontrado.");
            return;
        }

        for (File arquivo : arquivos) {
            contarLetras(arquivo, contagemLetras);
        }

        System.out.println("Contagem de letras:");
        for (int i = 0; i < contagemLetras.length; i++) {
            char letra = (char) ('A' + i);
            System.out.println(letra + ": " + contagemLetras[i]);
        }

        long fim = System.nanoTime();
        double tempoSegundos = (fim - inicio) / 1_000_000_000.0;
        System.out.printf("\nTempo de execução: %.3f segundos\n", tempoSegundos);
    }

    public static void contarLetras(File arquivo, int[] contagemLetras) {
        try (FileReader fr = new FileReader(arquivo)) {
            int c;
            while ((c = fr.read()) != -1) {
                if (Character.isLetter(c)) {
                    char letra = Character.toUpperCase((char) c);
                    contagemLetras[letra - 'A']++;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + arquivo.getName());
        }
    }
}
