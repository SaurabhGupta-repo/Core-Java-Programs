/*
Let's define digit degree of some positive integer as the number of times we need to replace this number with the sum of its digits until we get to a one digit number.

Given an integer, find its digit degree.

Example

    For n = 5, the output should be
    solution(n) = 0;
    For n = 100, the output should be
    solution(n) = 1.
    1 + 0 + 0 = 1.
    For n = 91, the output should be
    solution(n) = 2.
    9 + 1 = 10 -> 1 + 0 = 1.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] integer n

    Guaranteed constraints:
    5 ≤ n ≤ 109.

    [output] integer

*/

public class DIgitDegree{
  
  
 int solution(int n) {
   if( n/10==0)
     return 0;
    
    int num=0;
    
    while (n !=0)
    {
     num += n%10;
      n /=10;
      
    }
    return 1+ solution(num);
  }
  
  
  
}
