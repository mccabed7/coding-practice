/*
    Problem: implement an algorithm to find the zeroes in a matrix, and set their row and column to all zeroes
    Solution: Complete
    Tested: Yes
    Time Complexity: O(M * N)
    Space Complexity: O(1)

    Notes:
        + I initially thought to  use a seperate array for storing which rows and columns  needed to be zeroed.
        + However using the matrix  itself  worked fine.
 */

public class ZeroMatrix
{
    public static void solution(int[][] matrix){
        boolean rowZero = false;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;

                    if(i == 0){
                        rowZero = true;
                    }
                }
            }
        }

        for (int i = 1; i < matrix.length; i++)
        {
            if(matrix[i][0] == 0){
                for (int j = 0; j < matrix[i].length; j++)
                {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matrix[0].length; i++)
        {
            if(matrix[0][i] == 0){
                for (int j = 0; j < matrix.length; j++)
                {
                    matrix[j][i] = 0;
                }
            }
        }

        if(rowZero){
            for (int i = 0; i < matrix[0].length; i++)
            {
                matrix[0][i] = 0;
            }
        }

    }

    public static void main(String[] args)
    {
        int[][] matrix1 = {{0,2,3,1,1}, {4,5,6,0,1}, {7,8,9,1,1}, {1,1,1,1,0}};
        MatrixTools.printMatrix(matrix1);
        solution(matrix1);
        MatrixTools.printMatrix(matrix1);
    }
}
