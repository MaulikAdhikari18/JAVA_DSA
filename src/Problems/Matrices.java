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

    //Maximal Rectangle
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;

        int cols = matrix[0].length;
        int[] heights = new int[cols];
        int maxArea = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1')
                    heights[j] += 1;
                else
                    heights[j] = 0;
            }

            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }

        return maxArea;
    }

    public int largestRectangleArea(int[] heights) {

    Stack<Integer> stack = new Stack<>();
    int maxArea = 0;

    for (int i = 0; i <= heights.length; i++) {

        int h = (i == heights.length) ? 0 : heights[i];

        while (!stack.isEmpty() && h < heights[stack.peek()]) {

            int height = heights[stack.pop()];
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;

            maxArea = Math.max(maxArea, height * width);
        }

        stack.push(i);
    }

    return maxArea;
}
}