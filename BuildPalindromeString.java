/*
Given a string, find the shortest possible string which can be achieved by adding characters to the end of initial string to make it a palindrome.

Example

For st = "abcdc", the output should be
solution(st) = "abcdcba".

Input/Output

    [execution time limit] 3 seconds (java)

    [input] string st

    A string consisting of lowercase English letters.

    Guaranteed constraints:
    3 ≤ st.length ≤ 10.

    [output] string

*/

public class BuildPalindrome{
  
  String solution(String st) {


if(st.length()==1)
    return st;
//// abcdc    abcdcab
for (int i =0; i < st.length(); i++)
{
    
String str = st;
str += new StringBuilder(st.substring(0,i)).reverse().toString();
if(str.equals(new StringBuilder(str).reverse().toString())){
st = str;
break;
}
   

}

return st;
}

  
}
