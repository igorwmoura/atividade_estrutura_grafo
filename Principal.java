package java_project;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        //Grafo meuGrafo = new Grafo(0);

        try {
            File myObj = new File("test.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}
