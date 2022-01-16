/*
Given array of integers, remove each kth element from it.

Example

For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, the output should be
solution(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].

Input/Output

    [execution time limit] 3 seconds (java)

    [input] array.integer inputArray

    Guaranteed constraints:
    5 ≤ inputArray.length ≤ 15,
    -20 ≤ inputArray[i] ≤ 20.

    [input] integer k

    Guaranteed constraints:
    1 ≤ k ≤ 10.

    [output] array.integer

    inputArray without elements k - 1, 2k - 1, 3k - 1 etc.


*/

/* clue:  THe kth elements means k, 2k, 3k.... and coz array index is 0 based, so its k-1, 2k-1, 3k-1.... */
public class ExtractEachKth
{
  
  int[] solution(int[] inputArray, int k) {

List<Integer> list = new ArrayList<>();
	int len = inputArray.length;
int [] arr = new int [ len - len/k];
int j =0;
		int nextToRemove = k;
		for (int i = 0; i < inputArray.length; i++) {
			if(i+1 == nextToRemove) {
				nextToRemove += k;
				continue;
			}
			
			list.add(inputArray[i]);
            arr[j++] = inputArray[i];
            
		}
        /* to save the time for converting an Integer list to int array, declare an arry of size = (n - n/k) */
		//int [] outputArray = list.stream().mapToInt(Integer::intValue).toArray();
		//return outputArray;
        return arr;
}

  
  
  
}
  
  
