package java_project;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {

/*
        meuGrafo.print(meuGrafo);
        System.out.println();
*/

        try {
            File myObj = new File("test.txt");
            Scanner myReader = new Scanner(myObj);

            String data = myReader.nextLine();
            System.out.println(data);

            Grafo meuGrafo = new Grafo(Integer.parseInt(data));

            meuGrafo.print(meuGrafo);

            /*
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }*/
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}
