/*
Find the leftmost digit that occurs in a given string.

Example

    For inputString = "var_1__Int", the output should be
    solution(inputString) = '1';
    For inputString = "q2q-q", the output should be
    solution(inputString) = '2';
    For inputString = "0ss", the output should be
    solution(inputString) = '0'.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] string inputString

    A string containing at least one digit.

    Guaranteed constraints:
    3 ≤ inputString.length ≤ 10.

    [output] char

*/

public class FIrstDigit
{
  
  char solution(String inputString) {

for( int i =0; i < inputString.length(); i++)
{
    if(Character.isDigit(inputString.charAt(i)))
     return inputString.charAt(i);  
    
}

return Character.MIN_VALUE;

}

  
  
  
}
