package java_project;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Escolha um dos arquivos a seguir que contém uma matriz de adjacência:
                1)pcv4.txt
                2)pcv10.txt
                3)pcv50.txt
                4)pcv177.txt
                """);

        char escolha = sc.next().charAt(0);
        String arqEscolhido = null;

        switch (escolha) {
            case '1' -> arqEscolhido = "pcv4.txt";
            case '2' -> arqEscolhido = "pcv10.txt";
            case '3' -> arqEscolhido = "pcv50.txt";
            case '4' -> arqEscolhido = "pcv177.txt";
            default -> System.exit(0);
        }

        System.out.println("Escolha o vértice de origem: ");
        int verticeEscolhido = sc.nextInt();

        System.out.println("Escolha o vértice alvo para as buscas: ");
        int verticeAlvo = sc.nextInt();


        Grafo grafoPrincipal = Principal.carregarArquivo(arqEscolhido);
        grafoPrincipal.print(grafoPrincipal);
        int[][] distanciAnteriorCaminho = grafoPrincipal.buscaEmLargura(grafoPrincipal, verticeEscolhido, verticeAlvo);
        System.out.println();

        System.out.println("Distância de cada elemento para o vértice: "
                + Arrays.toString(distanciAnteriorCaminho[0]));

        System.out.println("Anterior do vértice até cada elemento: "
                + Arrays.toString(distanciAnteriorCaminho[1]));

        if(distanciAnteriorCaminho[2].length == 0){
            System.out.println("Não há caminho entre os vértices!");
        }else{System.out.println("Caminho do vértice "+ verticeEscolhido +" até o vértice " + verticeAlvo +":"
                + Arrays.toString(distanciAnteriorCaminho[2]));}

        System.out.println("Todos os elementos que as adjacências do vértice "+ verticeEscolhido +" se conectam: "
                + grafoPrincipal.buscaEmExtensao(grafoPrincipal, verticeEscolhido));

        sc.close();
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
