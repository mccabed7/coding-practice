/*
    Problem: implement an algorithm to find the zeroes in a matrix, and set their row and column to all zeroes
    Solution: incomplete
    Tested: no
    Time Complexity: Expected O(M * N)
    Space Complexity: Expected O(1)

    Notes:
        +
 */

public class ZeroMatrix
{
    public static void solution(int[][] matrix){
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
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
