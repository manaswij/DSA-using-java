public class Spiral {
    
    public static void spiralPrint(int[][] matrix, int r, int c){
        int i, k=0, l=0;
        while(k<r && l<c){
            for(i=l; i<c; i++){
                System.out.print(matrix[k][i]+ "");
            }
            k++;
            for(i=k; i<r; i++){
                System.out.print(matrix[i][c-1]+ "");
            }
            c--;
            if(k<r){
            for(i=c-1; i>=l; i--){
                System.out.print(matrix[r-1][i]+ "");
            }
            r--;
        }
            if(l<c){
            for(i=c-1; i>=l; i--){
                System.out.print(matrix[r-1][i]+ "");
            }
            r--;
        }
    }
    }


    public static void main(String[] args)
    {
        Spiral obj = new Spiral();
        int[][] matrix = {
            {10, 20, 30, 40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,51}
        };
        obj.spiralPrint(matrix, 4, 4);  
        
    };
}
