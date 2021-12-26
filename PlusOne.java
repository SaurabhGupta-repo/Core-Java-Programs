/*
PlusOne
you are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].



*/

class PlusOne {
    public int[] plusOne(int[] digits) {
      
        int temp = 0;
        for( int i =digits.length-1; i>=0; i-- ){
            
           
        if(i == digits.length-1 || temp >0)
        {  
            if(digits[i]+1 <10)
            {
                digits [i] = digits[i] +1;
                temp=0;
            }
            else 
            {
                temp= (digits[i] +1)/10;
                digits [i] = 0;
                
            }
        }
            
            
        }
     
     /* if we re-create an existing array with extra length/size, all the existing elements are copied and extra length is added to beginning indexes.*/
      if(temp >0)
     {
      digits = new  int [digits.length +1] ;
      digits[0] = temp;
      }
     return digits;
     
     
     /* alternate approach is to create a new array and copy the elements. Sample code below:*/
    /* int [] plusOneArr = null;
     if(temp >0)
     {
         plusOneArr = new  int [digits.length +1] ;
         plusOneArr[0] = temp;
         for (int j =0; j <digits.length; j++)
             plusOneArr[j+1]= digits[j];
     }else{
         plusOneArr = digits;
     }
       return plusOneArr; 
       */
     
    }
}
