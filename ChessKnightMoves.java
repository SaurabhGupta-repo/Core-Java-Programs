/*
Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.

The knight can move to a square that is two squares horizontally and one square vertically, or two squares vertically and one square horizontally away from it. The complete move therefore looks like the letter L. Check out the image below to see all valid moves for a knight piece that is placed on one of the central squares.

*/

public class ChessKnightMoves{
  
  
  int solution(String cell) {
    int moves = 8;
    if (cell.charAt(0) == 'b' || cell.charAt(0) == 'g') {
        moves -= 2;
    }
    if (cell.charAt(1) == '2' || cell.charAt(1) == '7') {
        moves -= 2;
    }
    if (cell.charAt(0) == 'a' || cell.charAt(0) == 'h') {
        moves /= 2;
    }
    if (cell.charAt(1) == '1' || cell.charAt(1) == '8') {
        moves /= 2;
    }
    return moves;
}

  
}
