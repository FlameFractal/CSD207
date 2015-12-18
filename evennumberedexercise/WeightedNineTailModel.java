import java.util.*;

public class WeightedNineTailModel {
  private List<Node> nodes = new ArrayList<Node>(); // Vertices
  private List<WeightedEdge> edges =
    new ArrayList<WeightedEdge>(); // Store edges
  private WeightedGraph graph; // Define a graph
  WeightedGraph.Tree tree; // Define a tree

  /** Construct a model */
  public WeightedNineTailModel() {
    createNodes(); // Create nodes
    createEdges(); // Create edges

    // Create a graph
    graph = new WeightedGraph(edges, nodes);

    // Obtain a tree rooted at the target node
    tree = graph.getShortestPath(511);
  }

  /** Create all nodes for the graph */
  private void createNodes() {
    for (int k1 = 0; k1 <= 1; k1++) {
      for (int k2 = 0; k2 <= 1; k2++) {
        for (int k3 = 0; k3 <= 1; k3++) {
          for (int k4 = 0; k4 <= 1; k4++) {
            for (int k5 = 0; k5 <= 1; k5++) {
              for (int k6 = 0; k6 <= 1; k6++) {
                for (int k7 = 0; k7 <= 1; k7++) {
                  for (int k8 = 0; k8 <= 1; k8++) {
                    for (int k9 = 0; k9 <= 1; k9++) {
                      nodes.add(new Node(k1, k2, k3, k4,
                        k5, k6, k7, k8, k9));
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  /** Node inner class */
  public static class Node {
    int[][] matrix = new int[3][3];

    /** Construct a Node from nine numbers */
    Node(int ...numbers) { // Variable-length argument
      int k = 0;
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          matrix[i][j] = numbers[k++];
        }
      }
    }

    /** Construct a Node from nine numbers in a 3 by 3 array */
    Node(int[][] numbers) {
      this.matrix = numbers;
    }

    /** Override the equals method to compare two nodes */
    public boolean equals(Object o) {
      int[][] anotherMatrix = ((Node)o).matrix;
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          if (matrix[i][j] != anotherMatrix[i][j]) {
            return false;
          }
        }
      }

      return true; // Nodes with the same matrix values
    }

    /** Return a string representation for the node */
    public String toString() {
      StringBuilder result = new StringBuilder();

      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          result.append(matrix[i][j] + " ");
        }
        result.append("\n");
      }

      return result.toString();
    }
  }

  /** Create all edges for the graph */
  private void createEdges() {
    for (Node node : nodes) {
      int u = nodes.indexOf(node); // node index
      int[][] matrix = node.matrix; // matrix for the node

      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          if (matrix[i][j] == 0) { // For a head cell
            Node adjacentNode = getAdjacentNode(matrix, i, j);
            int v = nodes.indexOf(adjacentNode);
            int numberOfFlips = getNumberOfFlips(adjacentNode,
              node);
            // Add edge (v, u) for a legal move from node u to node v
            edges.add(new WeightedEdge(v, u, numberOfFlips));
          }
        }
      }
    }
  }

  /** Get the adjacent node after fliping the cell at i and j */
  private Node getAdjacentNode(int[][] matrix, int i, int j) {
    int[][] matrixOfNextNode = new int[3][3];
    for (int i1 = 0; i1 < 3; i1++) {
      for (int j1 = 0; j1 < 3; j1++) {
        matrixOfNextNode[i1][j1] = matrix[i1][j1];
      }
    }

    flipACell(matrixOfNextNode, i - 1, j); // Top neighbor
    flipACell(matrixOfNextNode, i + 1, j); // Bottom neighbor
    flipACell(matrixOfNextNode, i, j - 1); // Left neighbor
    flipACell(matrixOfNextNode, i, j + 1); // Right neighbor
    flipACell(matrixOfNextNode, i, j);     // Flip self

    return new Node(matrixOfNextNode);
  }

  /** Change a valid cell from 0 to 1 and 1 to 0 */
  private void flipACell(int[][] matrix, int i, int j) {
    if (i >= 0 && i <= 2 && j >= 0 && j <= 2) { // Within boundary
      if (matrix[i][j] == 0) {
        matrix[i][j] = 1; // Flip from 0 to 1
      }
      else {
        matrix[i][j] = 0; // Flip from 1 to 0
      }
    }
  }

  /** Return the shortest path from the specified node to the root */
  public List<Node> getShortestPath(Node node) {
    Iterator iterator = tree.pathIterator(nodes.indexOf(node));
    LinkedList list = new LinkedList();

    // Insert the vertices on the path starting from the root to list
    while (iterator.hasNext())
      list.addFirst(iterator.next());

    return list;
  }

  /** Get the number of the flips */
  private int getNumberOfFlips(Node node1, Node node2) {
    int[][] matrix1 = node1.matrix;
    int[][] matrix2 = node2.matrix;

    int count = 0; // Count the different number of cells
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (matrix1[i][j] != matrix2[i][j]) count++;
      }
    }

    return count;
  }
}
