package java_project;

import java.util.*;

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
    //busca em largura/extensao(BFS)
    public int[][] buscaEmLargura(Grafo graph, int vertice, int verticeAlvo){
        int[] distancia = new int[graph.vertices];
        int[] anterior = new int[graph.vertices];
        boolean[] foiVisitado = new boolean[graph.vertices];

        for(int i = 0; i < graph.vertices; i++){
            distancia[i] = -1;
            anterior[i] = -1;
            foiVisitado[i] = false;
        }

        Queue<Integer> minhaFila = new LinkedList<>();
        minhaFila.add(vertice);
        foiVisitado[vertice] = true;
        distancia[vertice] = 0;

        while(!minhaFila.isEmpty()){
            int p = minhaFila.poll();
            System.out.println("Vertice: " + p);

            for(int l : graph.lista.get(p)){
                if(!foiVisitado[l]){
                    distancia[l] = distancia[p]+1;
                    anterior[l] = p;
                    minhaFila.add(l);
                    foiVisitado[l] = true;
                }
            }
        }

        LinkedList<Integer> caminho = new LinkedList<>();
        int atual = verticeAlvo;
        if(distancia[verticeAlvo] != -1){
            while (atual != -1) {
                caminho.addFirst(atual);
                atual = anterior[atual];
            }
        }

        int[] caminhoPercorrido = caminho.stream().mapToInt(Integer::intValue).toArray();

        return new int[][]{distancia, anterior, caminhoPercorrido};
    }

    
    //funcao para mostrar a matriz e a lista do grafo
    public void print(Grafo graph){
        for(int i = 0; i < graph.vertices; i++){
            for(int j = 0; j < graph.vertices; j++){
                System.out.print(graph.matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Lista de adjacência: ");
        for(LinkedList<Integer> i : graph.lista){
            System.out.print(i);
        }
        System.out.println();
        System.out.println();
    }
}