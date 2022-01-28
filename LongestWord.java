/*
Define a word as a sequence of consecutive English letters. Find the longest word from the given string.

Example

For text = "Ready, steady, go!", the output should be
solution(text) = "steady".
*/

public class LongestWord{
  
  //// Approach 1
// String [] split = text.split(", ");
//     return Arrays.stream(text.split("\\W+")).max((a, b) -> a.length() - b.length()).get();

//// Approach 2
  String [] s = text.split("[^a-zA-Z]");
    String result = "";
    for(int i = 0; i < s.length;i++){
        System.out.println("s[i]  --> "+s[i]);
        if(s[i].length() > result.length() )
            result = s[i];
    }
    return result;

  
  
}
