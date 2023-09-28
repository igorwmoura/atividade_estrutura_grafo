package java_project;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws FileNotFoundException {
        Grafo grafoPrincipal = Principal.carregarArquivo("pcv4.txt");
        grafoPrincipal.print(grafoPrincipal);
        int[][] distanciAnteriorCaminho = grafoPrincipal.buscaEmLargura(grafoPrincipal, 0, 1);
        System.out.println();

        System.out.println("Distância de cada elemento para o vértice: "
                + Arrays.toString(distanciAnteriorCaminho[0]));

        System.out.println("Anterior do vértice até cada elemento: "
                + Arrays.toString(distanciAnteriorCaminho[1]));

        if(distanciAnteriorCaminho[2].length == 0){
            System.out.println("Não há caminho entre os vértices!");
        }else{System.out.println("Caminho do vértice ate o vértice alvo escolhido: "
                + Arrays.toString(distanciAnteriorCaminho[2]));}
    }

    public static Grafo carregarArquivo(String arq)throws FileNotFoundException{
            File myObj = new File(arq);
            Scanner myReader = new Scanner(myObj);

            String firstLine = myReader.nextLine();
            System.out.println("Matriz de adjacência: ");
            System.out.println(firstLine);

            Grafo meuGrafo = new Grafo(Integer.parseInt(firstLine));

            int linha = 0;

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                data = data.strip();
                String[] numeros = data.split("\t");
                int coluna = 0;

//                System.out.println(data);
                for (String numero : numeros) {
                    if(coluna == meuGrafo.vertices){
                        break;
                    }
                    meuGrafo.matrix[linha][coluna] = Integer.parseInt(numero);
                    if(meuGrafo.matrix[linha][coluna] > 0){
                        meuGrafo.lista.get(linha).add(coluna);
                    }
                    coluna += 1;
                }
                linha += 1;
            }

            myReader.close();
            return meuGrafo;
    }

}
