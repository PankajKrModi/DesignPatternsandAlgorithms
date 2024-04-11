package graph;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class DFS {

    public static void main(String[] args) {
        int v = 9,e=9;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        for(int i=0;i<v;i++){
            edges.add(new ArrayList<>());
        }
        edges.get(0).addAll(Arrays.asList(6,8));
        edges.get(1).addAll(Arrays.asList(6,7,8));
        edges.get(2).addAll(Arrays.asList(5));
        edges.get(3).addAll(Arrays.asList(7));
        edges.get(4).addAll(Arrays.asList(7));
        edges.get(5).addAll(Arrays.asList(2));
        edges.get(6).addAll(Arrays.asList(0,1));
        edges.get(7).addAll(Arrays.asList(1,3,4,8));
        edges.get(8).addAll(Arrays.asList(0,1,7));

        ArrayList<ArrayList<Integer>> c = depthFirstSearch(v,e,edges);
        System.out.println(c.size());
        for(int i=0;i<c.size();i++) {
            for (int u : c.get(i))
                System.out.print(u + " ");
            System.out.println();
        }
    }
    public static ArrayList<ArrayList<Integer>> depthFirstSearch(int v, int e, ArrayList<ArrayList<Integer>> edges) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> components = new ArrayList<>();
        boolean []visited = new boolean[v];
        Arrays.fill(visited,false);

        int c = 0;
        for(int i=0; i<v; i++){
            if(visited[i]==false&& edges.get(i)!=null){
                ArrayList<Integer> component = new ArrayList<>();
                dfs(i,edges,visited,component);
                components.add(component);
            }
        }
        return components;
    }

    public static void dfs(int u, ArrayList<ArrayList<Integer>> edges,
                           boolean []visited, List<Integer> component){

            visited[u] = true;
            component.add(u);
            if(u<edges.size())
                for(int v:edges.get(u)){
                    if(visited[v]==false){
                        dfs(v,edges,visited,component);
                }
        }

    }

}