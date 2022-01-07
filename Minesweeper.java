/*

In the popular Minesweeper game you have a board with some mines and those cells that don't contain a mine have a number in it that indicates the total number of mines in the neighboring cells. Starting off with some arrangement of mines we want to create a Minesweeper game setup.

Example

For

matrix = [[true, false, false],
          [false, true, false],
          [false, false, false]]

the output should be

solution(matrix) = [[1, 2, 1],
                       [2, 1, 1],
                       [1, 1, 1]]

Check out the image below for better understanding:
*/

public class Minesweeper{
  
  int[][] solution(boolean[][] matrix) {


int[][] result = new int[matrix.length][matrix[0].length];
    
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            int neighbors = 0;
          
            // top
            if (i > 0 && matrix[i-1][j]) neighbors++;
            
            // bottom
            if (i+1 < matrix.length && matrix[i+1][j]) neighbors++;
            
            // left
            if(j > 0 && matrix[i][j-1]) neighbors++;
            
            // right
            if (j+1 < matrix[0].length && matrix[i][j+1]) neighbors++;
            
            // upper left
            if (i > 0 && j > 0 && matrix[i-1][j-1]) neighbors++;
            
            // upper right
            if (i > 0 && j+1 < matrix[0].length && matrix[i-1][j+1]) neighbors++;
            
            // lower left
            if (i+1 < matrix.length && j > 0 && matrix[i+1][j-1]) neighbors++;
            
            // lower right
            if (i+1 < matrix.length && j+1 < matrix[0].length && matrix[i+1][j+1]) neighbors++;
            
            result[i][j] = neighbors;
        }
    }
    
    return result;
  }
}
