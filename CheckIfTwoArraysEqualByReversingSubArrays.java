import java.io.*; 
import java.util.*;

/*
1. check if lenght of both arrays are equal
2. loop through 1st arrary and compare is with all the elements in 2nd array.
  if a element is missing, break the loop, and return false.
  
3. one one specific Edge case: when the target has duplicates:
   1st array:   [1,2,2,3]
   2nd array:   [1,1,2,3]
    
    Solution: Set 2nd array value for the matched element to Integer.MIN_VALUE;


*/
class CheckIfTwoArraysEqualByReversingSubArrays {

   boolean isEqualArrays(int[] arrayA, int[] arrayB) {
    // Write your code here
    
    boolean flag = false;
    
    // check if lenght of both arrays are equal
    if(arrayA.length == arrayB.length)
    {
      
      for( int i=0; i < arrayA.length; i++)
      {
        flag= false;
        for (int j =0 ; j < arrayB.length ; j++ )
        {
          
          if(arrayA [i] == arrayB[j])
          {
            flag= true;
            target[j]= Integer.MIN_VALUE;   // Set 2nd array value for the matched element to Integer.MIN_VALUE. 
            
            // if the element is found in 2nd array, then break the inner loop
            break;
          }
          else
            flag= false;
        }
      //  if a element is missing, break the outer loop, and return false.
        if (flag == false)
         break;
      
    }
            return flag;

  }

  }



