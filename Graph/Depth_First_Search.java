import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
 
public class DepthFirstSearch
{ 
 
 static class Node
 {
 int data;
 boolean visited;
 List<Node> neighbours;
 
 Node(int data)
 {
 this.data=data;
 this.neighbours=new ArrayList<>();
 
 }
 public void addneighbours(Node neighbourNode)
 {
 this.neighbours.add(neighbourNode);
 }
 public List<Node> getNeighbours() {
 return neighbours;
 }
 public void setNeighbours(List<Node> neighbours) {
 this.neighbours = neighbours;
 }
 }
 
 
 
 // DFS
 public  void dfsStack(Node node)
 {
 Stack<Node> stack=new  Stack<Node>();
 stack.add(node);
 while (!stack.isEmpty())
 {
 Node element=stack.pop();
 if(!element.visited)
 {
 System.out.print(element.data + " ");
 element.visited=true;
 }
 
 List<Node> neighbours=element.getNeighbours();
 for (int i = 0; i < neighbours.size(); i++) {
 Node n=neighbours.get(i);
 if(n!=null && !n.visited)
 {
 stack.add(n);
 }
 }
 }
 }
 
 public static void main(String arg[])
 {
 
 Node node45 =new Node(45);
 Node node10 =new Node(10);
 Node node15 =new Node(15);
 Node node30 =new Node(30);
 Node node60 =new Node(60);
 Node node50 =new Node(50);
 Node node70 =new Node(70);
 
 node45.addneighbours(node10);
 node45.addneighbours(node15);
 node10.addneighbours(node30);
 node15.addneighbours(node10);
 node15.addneighbours(node30);
 node15.addneighbours(node60);
 node15.addneighbours(node50);
 node30.addneighbours(node60);
 node60.addneighbours(node70);
 node50.addneighbours(node70);
 
 DepthFirstSearch dfs = new DepthFirstSearch();
 
 System.out.println("The DFS traversal of the graph using stack ");
 dfs.dfsStack(node45);
 
 System.out.println();
}
}
