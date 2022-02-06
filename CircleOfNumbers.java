/*
Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance between any two neighboring numbers is equal (note that 0 and n - 1 are neighboring, too).

Given n and firstNumber, find the number which is written in the radially opposite position to firstNumber.

Example

For n = 10 and firstNumber = 2, the output should be
solution(n, firstNumber) = 7.



*/


public class CircleOfNumbers{
  
 int solution(int n, int firstNumber) {


//// Approach 1:

/*
 0  --- n-1
 firstnumber
 
 oppNumber=     
 
  n is positive even int.
 0 -9
 mid = n /2 
 
 firsrNumber + mid 
*/
int mid = n/2;
int oppositeNumber =  mid + firstNumber;

if( oppositeNumber > n-1)
    oppositeNumber = oppositeNumber - n ;

return  oppositeNumber;


//// Approach 2:

   // return (firstNumber + mid) % n;


}


  
}
