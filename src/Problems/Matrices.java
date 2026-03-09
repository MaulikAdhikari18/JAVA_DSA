package Problems;

public class Matrices{
    
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int [][] result = new int[n][m];

        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    //Reshape Matrix
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;

    if (m * n != r * c) return mat;

    int[][] result = new int[r][c];

    for (int i = 0; i < m * n; i++) {
        result[i / c][i % c] = mat[i / n][i % n];
    }
    return result;
    }
}