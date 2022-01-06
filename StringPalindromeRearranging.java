/*
Given a string, find out if its characters can be rearranged to form a palindrome.

Example

For inputString = "aabb", the output should be
solution(inputString) = true.

We can rearrange "aabb" to make "abba", which is a palindrome.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] string inputString

    A string consisting of lowercase English letters.

    Guaranteed constraints:
    1 ≤ inputString.length ≤ 50.

    [output] boolean

    true if the characters of the inputString can be rearranged to form a palindrome, false otherwise.


*/

public class StringPalindromeRearranging {
  
  boolean solution(String inputString) {


Set<Character> set= new HashSet();

for (Character c : inputString.toCharArray())
{
    if (set.contains(c))
        set.remove(c);
    else    
        set.add(c);
    
}

return set.isEmpty() || set.size()==1;
}

  
}
