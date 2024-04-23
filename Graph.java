package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Edge{
    int src;
    int dest;
    int weight;
    Edge(int src,int dest,int weight){
        this.src=src;
        this.dest=dest;
        this.weight=weight;
    }
}

public class Graph {
 public static void main(String[] args) {
    ArrayList<Edge> graph []=new ArrayList[4];
   // System.out.println(graph.length);
    createGraph(graph);
    bfs(graph, 4);
    //System.out.println(graph[1].get(0).dest);

 }   
 public static void createGraph(  ArrayList<Edge> graph[]){
    for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<Edge>();
    }
    graph[0].add(new Edge(0, 1, 10));
    graph[0].add(new Edge(0, 2, 10));
  
    graph[1].add(new Edge(1, 2, 13));
    graph[1].add(new Edge(1, 3, 12));
    
    graph[2].add(new Edge(2, 0,6));
    graph[2].add(new Edge(2, 1, 4));
    graph[2].add(new Edge(2, 3, 6));
   
    graph[3].add(new Edge(3, 2, 6));
    graph[3].add(new Edge(3, 1, 12));
   
}

public static void bfs(ArrayList<Edge> graph[],int size){
Queue<Integer> qe=new LinkedList<>();
boolean arr[]=new boolean[size];
qe.add(0);
while(qe.size()!=0){
    int curr=qe.remove();
    if(arr[curr]==false){
        System.out.println(curr);
        arr[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            qe.add(graph[curr].get(i).dest);
        }
    }
}
}
}
