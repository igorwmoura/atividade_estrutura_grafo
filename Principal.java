package java_project;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) throws FileNotFoundException {

        Grafo grafoPrincipal = Principal.carregarArquivo("test.txt");
        grafoPrincipal.print(grafoPrincipal);
    }

    public static Grafo carregarArquivo(String arq)throws FileNotFoundException{
            File myObj = new File(arq);
            Scanner myReader = new Scanner(myObj);

            String firstLine = myReader.nextLine();
            System.out.println(firstLine);

            Grafo meuGrafo = new Grafo(Integer.parseInt(firstLine));

//            int l = 0;

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                data = data.strip();
                String[] numeros = data.split("\t");
                System.out.println(data);
                for (String numero : numeros) {
                    System.out.println(numero);
                }
            }

            myReader.close();
            return meuGrafo;
    }
}
