import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

public class GridUniquePath {
    public static void main(String[] args) {
        int m=2,n=3;
        int mn[][] = new int[m][n];
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            int j=0;
            //traverse left
            if(validMove(mn,visited,i,j)){

            }
            //traverse down

        }
    }
    public static boolean validMove(int [][]mn,boolean[][] visited, int r, int c){
            if(r< mn.length && c<mn[0].length && !visited[r][c]){
                return true;
            }
            return false;
    }
    public static void traverse(int [][]mn,boolean[][] visited, int r, int c){
        
    }
}
