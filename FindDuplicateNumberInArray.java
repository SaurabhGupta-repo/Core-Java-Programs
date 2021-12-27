/*
FindDuplicateNumberInArray

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2

Example 2:

Input: nums = [3,1,3,4,2]
Output: 3

 

*/

class FindDuplicateNumberInArray {
    public int findDuplicate(int[] nums) {
     
         //// Approach - 1    with Time O(n*n/2) and Space O(1)
        
        int duplicateNum=-1; 
        for(int i =0; i <nums.length; i++)
        {
            
            duplicateNum= nums[i];
            
            for (int j =i+1; j <nums.length; j++)
            {
                if (duplicateNum ==  nums [j])
                    return duplicateNum;  
                
                if (j < nums.length/2 && duplicateNum ==  nums [nums.length -j])
                    return duplicateNum; 
            }
            
        }
        
        return duplicateNum;
        
        //// Approach -2   Space O(n) and Time O(n)
        Set <Integer> intSet = new HashSet();
         for(int i =0; i <nums.length; i++)
         {
             if(intSet.contains(nums[i]))
                 return nums[i];
            else
                intSet.add(nums[i]);
         }
        
        return -1;
        
    }
}
