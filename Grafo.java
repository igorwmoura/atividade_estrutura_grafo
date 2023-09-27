package java_project;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Grafo
 */
public class Grafo {
    int vertices; //numero de vertices
    int[][] matrix; //representacao do grafo em matriz
    ArrayList<LinkedList<Integer>> lista; //representacao do grafo em lista

    //contrutores dos vertices, matriz e lista
    public Grafo(int vertices){
        
        this.vertices = vertices;
        int[][] matrix = new int[vertices][vertices];
        lista = new ArrayList<>();
        
        for(int i = 0; i < vertices; i++){
            for(int j = 0; j < vertices; j++){
                matrix[i][j] = 0;
            }
        }
        this.matrix = matrix;

        for(int i = 0; i < vertices; i++){
            lista.add(new LinkedList<>());
        }
    }
    
    //funcao para mostrar a matriz e a lista do grafo
    public void print(Grafo graph){
        for(int i = 0; i < vertices; i++){
            for(int j = 0; j < vertices; j++){
                System.out.print(graph.matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for(LinkedList<Integer> i : graph.lista){
            System.out.print(i);
        }
    }
}