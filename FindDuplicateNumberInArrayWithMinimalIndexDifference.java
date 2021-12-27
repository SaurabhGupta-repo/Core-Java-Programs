/*
FindDuplicateNumberInArrayWithMinimalIndexDifference

Given an array array that contains only numbers in the range from 1 to array.length, find the first duplicate number for which the second occurrence has the minimal index. In other words, if there are more than 1 duplicated numbers, return the number for which the second occurrence has a smaller index than the second occurrence of the other number does. If there are no such elements, return -1.

Example

    For array = [2, 3, 3, 1, 5, 2], the output should be
    firstDuplicate(array) = 3.
    There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a smaller index than than second occurrence of 2 does, so the answer is 3.

    For array = [2, 4, 3, 5, 1], the output should be
    firstDuplicate(array) = -1
 

*/

class FindDuplicateNumberInArray {
   int solution(int[] array) {
      
     //// Approach -2  Time O(n* n) Space O(1)
     int duplicateNum=-1;
     int traverseSize=array.length; 
        for(int i =0; i <array.length; i++)
        {                        
            for (int j =i+1; j <array.length; j++)
            {
               
                if (array [i]  ==  array [j]  && traverseSize > j-i)
                {
                    
                    traverseSize= j-i;
                    duplicateNum = array[i];
                    //return duplicateNum;  

                }
            }
        }
        
        return duplicateNum;
       
     //// Approach -2  Time O(n) Space O(n)
        // Set <Integer> intSet = new HashSet();
        //  for(int i =0; i <array.length; i++)
        //  {
        //      if(intSet.contains(array[i]))
        //          return array[i];
        //     else
        //         intSet.add(array[i]);
        //  }
        
        // return -1;
        
       
}

}
