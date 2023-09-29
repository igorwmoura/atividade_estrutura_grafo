# Estrutura Grafo
Implementação de Grafo, Busca em Largura(BFS) e Busca em Profundidade(DFS)

## classe Grafo
Os atributos do grafo são divididos em:
+ Número de vértices
+ Matriz de adjacência
+ Lista de adjacência

```
    int vertices;
    int[][] matrix;
    ArrayList<LinkedList<Integer>> lista; 
```

E existem três métodos:
+ Busca em Largura
+ Busca em Profundidade
+ Imprimir

```
public int[][] buscaEmLargura(Grafo graph, int vertice, int verticeAlvo);
public LinkedList<Integer> buscaEmExtensao(Grafo graph, int vertice);
public void print(Grafo graph);
```

## Proposta
Implemente a estrutura grafo com representação em: Matriz de Adjacência
e Lista de Adjacência. Depois implemente as seguintes atividades:

+ Leitor dos arquivos e carregamento das estruturas do grafo
+ Busca em largura (BFS)
    + Criar uma função que imprima o caminho entre dois
vértices s e t formado pelo BFS. Indicar que “não há
caminho entre os vértices” caso não haja o caminho.
+ Buca em Profundidade (DFS)
    + Reimplemente o DFS com auxílio de uma pilha para
eliminar a recursão da implementação

## Arquivos testes
Existem quatro arquivos .txt contendo as matrizes de adjacência.

Exemplo:
```
4
0	3	4	0
3	0	5	7
4	5	0	0
0	7	0	0
```
Onde a primeira linha do arquivo contém o número de vértices contidos no grafo.
