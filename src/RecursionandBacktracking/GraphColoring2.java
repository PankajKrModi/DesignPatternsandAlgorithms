package RecursionandBacktracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//minimum number of color reqd. to paint the graph
public class GraphColoring2 {
    public static void main(String[] args) {
        int N= 4;

        List<Integer> g[] = new List[N];
        int[] colors = new int[N];
        Arrays.fill(colors,-1);

        for (int i = 0; i < N; i++) {
            g[i] = new ArrayList<>();
        }
//        g[0].addAll(Arrays.asList(1,2,3));
//        g[1].addAll(Arrays.asList(0,2,3));
//        g[2].addAll(Arrays.asList(0,1));
//        g[3].addAll(Arrays.asList(0,1));

        g[0].addAll(Arrays.asList(1,3));
        g[1].addAll(Arrays.asList(0,2));
        g[2].addAll(Arrays.asList(1,3));
        g[3].addAll(Arrays.asList(0,2));
        int maxColor =1;
        for(int i=0;i<g.length;i++) {
            maxColor = Math.max(minimumColorForPaint(g, i, colors),maxColor);
        }
        System.out.println(maxColor);
    }

    public static int minimumColorForPaint(List<Integer> g[], int u, int[] colors) {
        int i=1;
        while(isSafeToColorVertex(g,u,i,colors)!=true){
            i++;
        }
        colors[u] = i;
        return i;
    }

    public static boolean isSafeToColorVertex(List<Integer> g[], int u,int color, int []colors) {
        for(int i:g[u]){
            if(colors[i]==color)
                return false;
        }
        return true;
    }
}
