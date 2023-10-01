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
Existem quatro arquivos .txt contendo as matrizes de adjacência:
+ pcv4.txt
+ pcv10.txt
+ pcv50.txt
+ pcv177.txt

Exemplo:
```
//utilizando o arquivo "pcv4.txt"
4
0	3	4	0
3	0	5	7
4	5	0	0
0	7	0	0
```
Onde a primeira linha do arquivo contém o número de vértices contidos no grafo.
É pedido um vértice de origem e um vértice alvo para as funções de busca.

Usando '0' e '3' como exemplo para o arquivo "pcv4.txt", as saídas esperadas são:
```
//imprime a matriz
Matriz de adjacência: 
4
0	3	4	0	
3	0	5	7	
4	5	0	0	
0	7	0	0	

//imprime a lista
Lista de adjacência: 
[1, 2][0, 2, 3][0, 1][1]

//mostra os vértices visitados
Vertice: 0
Vertice: 1
Vertice: 2
Vertice: 3

//busca em largura(bfs)
Distância de cada elemento para o vértice: [0, 1, 1, 2]
Anterior do vértice até cada elemento: [-1, 0, 0, 1]
Caminho do vértice 0 até o vértice 3:[0, 1, 3]

//busca em profundidade(dfs)
Todos os elementos que as adjacências do vértice 0 se conectam: [1, 2, 3] //mostra todas as conexões em ordem crescente, para distinguir melhor quais vértices estão desconectados
```
