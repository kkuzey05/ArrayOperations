public class ArrayMultiplier
{
    public static void main(String[] args)
    {
        int[][] A = {{1,2,3} , {4,5,6}};
        int[][] B = {{0,0,1} , {1,1,1}, {0,0,0}};        
        
        if (A[0].length != B.length){
            System.out.println("Invalid matrices."); // Column # of A should be equal to row # of B 
        }
        
        else{
            int[][] C = new int[A.length][B[0].length];
            for(int i = 0; i<A.length; i++){
                for (int x= 0; x<B.length; x++){
                    for (int j = 0; j<B[0].length; j++){
                        C[i][x] += A[i][j]*B[j][x];
                    }
                }
            }
            for (int[] row : C){
                for (int column : row){
                    System.out.print(column+" ");
                }
                System.out.println();
            }
        }
    }
}
