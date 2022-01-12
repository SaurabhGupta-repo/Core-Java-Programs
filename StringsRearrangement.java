/*
Given an array of equal-length strings, you'd like to know if it's possible to rearrange the order of the elements in such a way that each consecutive pair of strings differ by exactly one character. Return true if it's possible, and false if not.

Note: You're only rearranging the order of the strings, not the order of the letters within the strings!

Example

    For inputArray = ["aba", "bbb", "bab"], the output should be
    solution(inputArray) = false.

    There are 6 possible arrangements for these strings:
        ["aba", "bbb", "bab"]
        ["aba", "bab", "bbb"]
        ["bbb", "aba", "bab"]
        ["bbb", "bab", "aba"]
        ["bab", "bbb", "aba"]
        ["bab", "aba", "bbb"]

    None of these satisfy the condition of consecutive strings differing by 1 character, so the answer is false.

    For inputArray = ["ab", "bb", "aa"], the output should be
    solution(inputArray) = true.

    It's possible to arrange these strings in a way that each consecutive pair of strings differ by 1 character (eg: "aa", "ab", "bb" or "bb", "ab", "aa"), so return true.


*/

public class StringsRearrangement{
 
  
boolean solution(String[] inputArray) {

LinkedList<String> tries= new LinkedList<>();

for( String str: inputArray){
    tries.offer(str);
}

LinkedList<String> matches= new LinkedList<>();
matches.offer(tries.poll());
int len= matches.getFirst().length();
while (!tries.isEmpty())
{
    int numOfTries = tries.size();
    String first = matches.getFirst();
    String last= matches.getLast();
    
    for ( int t =0; t < numOfTries; t++)
    {
            String actual = tries.poll();

        if (exactOneDIff(first, actual, len))
        {
            matches.addFirst(actual);
            break;        
        }
        else if (exactOneDIff(last, actual, len))
        {
            matches.addLast(actual);
            break;        
        }
        else      
            tries.offer(actual);
    }
    
    if(numOfTries == tries.size())
    return false;
    
}

//System.out.println("possibleArrangements : "+possibleArrangements);
return true;

}

/*
for comparing 2 string for difference
*/
boolean exactOneDIff(String first, String second, int length)
{
    
    int diff =0;
    for( int ch=0; ch<length; ch++)
    {
        if(first.charAt(ch) != second.charAt(ch))
            diff++;
        
    }
    
    return diff==1;
}
  
}
