/*
Given a string, output its longest prefix which contains only digits.

Example

For inputString = "123aa1", the output should be
solution(inputString) = "123".

Input/Output

    [execution time limit] 3 seconds (java)

    [input] string inputString

    Guaranteed constraints:
    3 ≤ inputString.length ≤ 100.

    [output] string

*/

public class LongestDigitsPrefix
{
String solution(String inputString) {


for ( int i =0; i <inputString.length(); i++)
{
   
    if(!Character.isDigit(inputString.charAt(i)))
        return inputString.substring(0,i);    
    
}
return inputString;

}

}
