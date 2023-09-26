package java_project;
/**
 * Grafo
 */
public class Grafo {
    int vertices; //numero de vertices
    int[][] matrix; //representacao do grafo em matriz
    int[] lista; //representacao do grafo em lista

    //contrutores dos vertices, matriz e lista
    public Grafo(int vertices){
        
        this.vertices = vertices;
        int[][] matrix = new int[vertices][vertices];
        int[] lista = new int[vertices];
        
        for(int i = 0; i < vertices; i++){
            for(int j = 0; j < vertices; j++){
                matrix[i][j] = 0;
            }
        }

        this.matrix = matrix;

        /*
        for(int k = 0; k < vertices; k++){
            lista[k] = 0;
        }*/
        this.lista = lista;
    }
    
    //funcao para mostrar a matriz e a lista do grafo
    public void print(Grafo graph){
        for(int i = 0; i < vertices; i++){
            for(int j = 0; j < vertices; j++){
                System.out.print(graph.matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for(int k = 0; k < vertices; k++){
            System.out.print(graph.lista[k]);
        }
    }
}