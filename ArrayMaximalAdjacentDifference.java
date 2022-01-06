/*
Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

Example

For inputArray = [2, 4, 1, 0], the output should be
solution(inputArray) = 3.

*/

public class ArrayMaximalAdjacentDifference
{
  
int solution(int[] inputArray) {

int  diff =0;
for( int i =0; i < inputArray.length-1; i++)
{
    
        if (diff <  Math.abs( inputArray[i]  - inputArray[i+1]))
        {
           diff =  Math.abs( inputArray[i]  - inputArray[i+1]);
        }
   
}
return diff;
}
  
  
}
