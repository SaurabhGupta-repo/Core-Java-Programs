/*
Given two cells on the standard chess board, determine whether they have the same color or not.

Example

    For cell1 = "A1" and cell2 = "C3", the output should be
    solution(cell1, cell2) = true.
*/
public class ChessBoardCellColor{
  
  
  boolean solution(String cell1, String cell2) {

//// same color 
    //// if difference b/w both axis is same 
    
    char c1x= cell1.charAt(0), c1y= cell1.charAt(1);
    char c2x = cell2.charAt(0), c2y= cell2.charAt(1);
    
    return Math.abs(c2x-c1x)%2 == Math.abs(c2y - c1y)%2;

}

  
}
