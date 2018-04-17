/*
 * Latriss King 
 * Data Structures Lab 13
 * The purpose of this lab is to write two DFS methods to Graph.java
 */

import java.util.Stack;

public class Graph
{
private final int MAX_VERTS = 20;

private Vertex vertexList[]; // list of vertices

private int adjMatrix[][];      // adjacency matrix

private int nVerts;          // current number of vertices

private Stack theStack;
//------------------------------------------------------------

public Graph()               // constructor
   
{
   vertexList = new Vertex[MAX_VERTS];
                                       // adjacency matrix
   adjMatrix = new int[MAX_VERTS][MAX_VERTS];
   
   nVerts = 0;
   
   for(int y = 0; y <MAX_VERTS; y++) 
   {	// set adjacency
      for(int x = 0; x < MAX_VERTS; x++)   //    matrix to 0
         adjMatrix[x][y] = 0;
   theStack = new Stack();
   }  // end constructor
   
   
//add vertex
public void addVertex(char lab)
   {
	
	vertexList[nVerts++] = new Vertex(lab);
	
   }

//add edge
public void addEdge(int start, int end)
   {
	
   
	adjMatrix[start][end] = 1;
	adjMatrix[end][start] = 1;
	
	
   }
//display vertax
public void displayVertex(int v)
   {
	
   
   System.out.print(vertexList[v].data);
   
   
   }
/*
 * depth-first search: Stack_based
 * 
 */
public void dfs()  // depth-first search
{                                 // begin at vertex 0
	vertexList[0].isVisited = true;  // mark it
	//displayVertex(0);                 // display it
	theStack.push(0);                 // push it
	

while( !theStack.isEmpty() )      // until stack empty,
   {
	
   // get an unvisited vertex adjacent to stack top
	
   int v = getAdjUnvisitedVertex( theStack.peek() );
   if(v == -1)                    // if no such vertex,
   {
      theStack.pop();
   }
   
   else                           // if it exists,
      {
	   	vertexList[v].isVisited = true;  // mark it
      //displayVertex(v);                 // display it
      theStack.push(v);                 // push it
      }
   }  // end while

// stack is empty, so we're done

for(int j=0; j<nVerts; j++)          // reset flags
{
	
	vertexList[j].isVisited = false;
	
}
	

	
}

}  // end dfs
//------------------------------------------------------------

// returns an unvisited vertex adj to v
public int getAdjUnvisitedVertex(int v)
{
for(int j = 0; j < nVerts; j++)
	{
   if(adjMatrix[v][j] == 1 && vertexList[j].isVisited == false)
   {
      return j;
   }  
   
	}
return -1;

}  // end getAdjUnvisitedVertex()
//------------------------------------------------------------

/*
 * depth-first search: Recursive
 */
public void recursive_dfs(int start)
{
	Stack<Integer> q = new Stack<Integer>();
	boolean [] visited = new boolean[adjMatrix.length];
	
	q.add(start);
	System.out.print(start + " ");
	visited[start] = true;
	
	while (!q.empty())
	{
		int node = q.pop();
		//System.out.print(node + " ");
		
		for (int i = 0; i < adjMatrix.length; i++)
			if (adjMatrix[node][i] && !visited[i])
			{
				visited[i] = true;
				q.push(i);
				System.out.print(i + " ");
				
			}
		
	}//TO-DO
} // end depthFirstSearch



}  // end class Graph
////////////////////////////////////////////////////////////////

class Vertex

{
	

public char data;        // data 
public boolean isVisited;

public Vertex(char d)   // constructor
   {
	
   
   data = d;
   isVisited = false;
   
   
   }

}  // end class Vertex
