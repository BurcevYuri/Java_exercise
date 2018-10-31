package Yuri.Burcev.FirstLab;

public class Matrix {
    int matrixsize;
    int[][] matrix;

   public void MatrixFilling() {
       for(int i=0; i<matrixsize; i++){
           for(int j=0; j<matrixsize; j++)
               if(i==j | j==matrixsize - i - 1)
                   matrix[i][j]=1;
               else
                   matrix[i][j]=0;
       }
   }

    public void matrixoutput() {
        for (int i = 0; i < matrixsize; i++) {
            for (int j = 0; j < matrixsize; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

     public Matrix(int matrixsize){
       this.matrixsize = matrixsize;
       matrix = new int[matrixsize][matrixsize];
    }
}



