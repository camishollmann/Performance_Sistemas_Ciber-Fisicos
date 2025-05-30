package ContaOcorrenciasArquivosExemplo;

import java.io.File;
import java.util.ArrayList;

public class Main {
    public static ArrayList<String> listFilesFromFolder(String folder){
        ArrayList<String> arquivos = new ArrayList();
        File pasta = new File(folder);
        File[] files = pasta.listFiles();

        for (File file: files){
            if (file.isFile()){
                arquivos.add(file.getAbsolutePath());
            }
        }
        return arquivos;
    }
}
public static void main(String[] args) throws InterruptExceptions {
    ArrayList<String> arquivos = listFilesFromFolder("/Users/");
    System.out.println(arquivos);

}
