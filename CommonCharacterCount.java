/*
CommonCharacterCount
Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
solution(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".
*/
public class CommonCharacterCount {
    public static void main(String[] args) {
        System.out.println(solution("aabcccccccccc", "adcaa"));

    }
    
int solution(String s1, String s2) {

int commonCharCount=0;
ArrayList<Character> charList = new ArrayList<>();
   for(char c : s2.toCharArray()){
            charList.add(c);
}
            
for(char ch: s1.toCharArray()){
    if(charList.contains(ch))
    {
        charList.remove(charList.indexOf(ch));
        ++commonCharCount;
    } 
    
    
    }

return commonCharCount;
}

}
