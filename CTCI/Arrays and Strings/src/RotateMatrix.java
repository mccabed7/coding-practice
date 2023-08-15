/*
    Problem: implement an algorithm that rotates a matrix 90 degrees clockwise
    Solution: incomplete
    Tested:
    Time Complexity:
    Space Complexity:

    Notes:
        +
        +

 */


public class RotateMatrix
{

    public static boolean solution(int[][] matrix){
        if(!MatrixTools.isSquare(matrix) || matrix.length == 0)  return false;
        for (int i = 0; i < matrix.length / 2; i++)
        {
            int end = matrix.length -1 - i;
            for (int j = i; j < end; j++)
            {
                int temp =  matrix[i+j][i];  //temp copy of top left

                matrix[i+j][i] = matrix[i][end-j];
                matrix[i][end-j]  =  matrix[end-j][end];
                matrix[end-j][end] = matrix[end][i + j];
                matrix[end][i + j] = temp;
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        int[][] matrix1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        MatrixTools.printMatrix(matrix1);
        solution(matrix1);
        MatrixTools.printMatrix(matrix1);

        int[][] matrix2 =  {{1,2,3,55}, {4,5,6,77}, {7,8,9,33}, {4,3,2,1}};
        MatrixTools.printMatrix(matrix2);
        solution(matrix2);
        MatrixTools.printMatrix(matrix2);

        int[][] matrix3 =  {{5}};
        MatrixTools.printMatrix(matrix3);
        solution(matrix3);
        MatrixTools.printMatrix(matrix3);
    }
}
