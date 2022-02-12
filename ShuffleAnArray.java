/*
Given an integer array nums, design an algorithm to randomly shuffle the array. All permutations of the array should be equally likely as a result of the shuffling.

Implement the Solution class:

    Solution(int[] nums) Initializes the object with the integer array nums.
    int[] reset() Resets the array to its original configuration and returns it.
    int[] shuffle() Returns a random shuffling of the array.

 

Example 1:

Input
["Solution", "shuffle", "reset", "shuffle"]
[[[1, 2, 3]], [], [], []]
Output
[null, [3, 1, 2], [1, 2, 3], [1, 3, 2]]

Explanation
Solution solution = new Solution([1, 2, 3]);
solution.shuffle();    // Shuffle the array [1,2,3] and return its result.
                       // Any permutation of [1,2,3] must be equally likely to be returned.
                       // Example: return [3, 1, 2]
solution.reset();      // Resets the array back to its original configuration [1,2,3]. Return [1, 2, 3]
solution.shuffle();    // Returns the random shuffling of array [1,2,3]. Example: return [1, 3, 2]



*/



public class ShuffleAnArray{
  
    private int[] originalArray;
    private int[] shuffleArray;
    private Random random;

    public Solution(int[] nums) {
        shuffleArray = nums;
        originalArray = nums.clone();
        random = new Random();
    }
    
    public int[] reset() {
        return originalArray;
    }
    
    public int[] shuffle() {
        for(int i=0;i<shuffleArray.length;i++){
            int j = random.nextInt(shuffleArray.length-i) + i;
            swap(i,j);
        }
        return shuffleArray;
    }
    
    private void swap(int i, int j){
        int temp = shuffleArray[i];
        shuffleArray[i] = shuffleArray[j];
        shuffleArray[j] = temp;
    }
}
