package RecursionandBacktracking;

import java.util.*;

//find number of ways vertices can be colored using M color
public class GraphColoring {
    public static void main(String[] args) {
        int N = 4;//no of vertices
        int M = 3;//colors
        List<Integer> g[] = new List[N];
        int colors[] = new int[N];

        for (int i = 0; i < N; i++) {
            g[i] = new ArrayList<>();
            colors[i] = -1;//no colors associated to any vertices
        }

//        g[0].addAll(Arrays.asList(1,3));
//        g[1].addAll(Arrays.asList(0,2));
//        g[2].addAll(Arrays.asList(1,3));
//        g[3].addAll(Arrays.asList(0,2));

        g[0].addAll(Arrays.asList(1,2,3));
        g[1].addAll(Arrays.asList(0,2,3));
        g[2].addAll(Arrays.asList(0,1));
        g[3].addAll(Arrays.asList(0,1));

        colorGraph(g,colors,0,M);

    }

    public static void colorGraph(/*Set<Integer> visited,*/List<Integer> g[],int colors[],int u,int M){
        if(u==g.length){
            for (int i = 0; i < colors.length; i++) {
                System.out.print(colors[i]+" ");
            }
            System.out.println();
            return ;
        }
        for(int m=1;m<=M;m++){
            if(isSafe(u,m,g,colors)){
                colors[u] = m;
                colorGraph(g,colors,u+1,M);
                colors[u] = -1;

            }
        }
    }

    public static boolean isSafe(int u,int m,List<Integer> g[],int colors[]){
        for(int v:g[u]){
            if(colors[v]!=-1 && m==colors[v]) return false;
        }
        return true;
    }
}
