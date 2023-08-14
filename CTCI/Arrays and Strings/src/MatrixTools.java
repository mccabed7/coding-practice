public class MatrixTools
{
    public static boolean IsSquare(int [][] matrix){

        for (int i = 0; i < matrix.length; i++)
        {
            if(matrix[i].length != matrix.length) return false;
        }
        return true;
    }

    public static void PrintMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] +",");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
