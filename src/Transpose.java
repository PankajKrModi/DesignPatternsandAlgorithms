public class Transpose {
    public static void main(String[] args) {

        int R=2,C=3;
        int arr[][] = {{2,5,3},{4,7,0}};
        int sol[][] = new int[C][R];

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                sol[j][i] = arr[i][j];
            }
        }

        for(int i=0;i<C;i++){
            for(int j=0;j<R;j++){
             System.out.print(sol[i][j]);
            }
            System.out.println("");
        }
    }
}
