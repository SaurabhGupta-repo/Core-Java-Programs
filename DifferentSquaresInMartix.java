/*

Given a rectangular matrix containing only digits, calculate the number of different 2 × 2 squares in it.

Example

For

matrix = [[1, 2, 1],
          [2, 2, 2],
          [2, 2, 2],
          [1, 2, 3],
          [2, 2, 1]]

the output should be
solution(matrix) = 6.

Here are all 6 different 2 × 2 squares:

    1 2
    2 2
    
    2 1
    2 2
    
    2 2
    2 2
    
    2 2
    1 2
    
    2 2
    2 3
    
    2 3
    2 1

*/


public class DifferentSquaresInMartix{
  
  int solution(int[][] matrix) {



int squareCount=0;
Set<String> squareSet= new HashSet<>();
for(int row =0; row <matrix.length-1; row++)
{
    for ( int col=0; col <matrix[0].length-1; col++)
    {
        
        String a= "" + matrix[row][col] + matrix[row][col+1] +  matrix[row+1][col] + matrix[row+1][col+1] ;
        if(squareSet.add(a))
            ++squareCount;
       
    }
}
return squareCount;


}

  
  
}
