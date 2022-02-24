package packagelab010;

public class Graph {
	private boolean adjacencyMatrix[][];
	private int numberOfVertices;

	public Graph(int numberOfVertices) {
		this.numberOfVertices = numberOfVertices;
		adjacencyMatrix = new boolean[numberOfVertices][numberOfVertices];
	}

	public void addEdge(int i, int j) {
		// To be completed by students
		adjacencyMatrix[i][j] = true; // add edge: source ---> destination
		adjacencyMatrix[j][i] = true; // add edge: destination ---> sorce

	}

	public void removeEdge(int i, int j) {
		// To be completed by students
		adjacencyMatrix[i][j] = false; // add edge: source ---> destination
		adjacencyMatrix[j][i] = false; // add edge: destination ---> sorce

	}

	public boolean isEdge(int i, int j) {
          // to be completed by students
         if(adjacencyMatrix[i][j] == true){
            return true;
         }else{
               return false;}       //add edge:   source ---> destination
    }

	public void displayGraph() {
		System.out.printf("%10s", " ");
		for (int i = 0; i < numberOfVertices; i++)
			System.out.printf("%10s", i);
		System.out.println();
		for (int i = 0; i < numberOfVertices; i++) {
			System.out.printf("%10s", i);
			for (int j = 0; j < numberOfVertices; j++) {
				System.out.printf("%10s", adjacencyMatrix[i][j]);
			}
			System.out.println();
		}

	}
}
