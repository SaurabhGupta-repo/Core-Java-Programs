/*
All Longest Strings
Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
solution(inputArray) = ["aba", "vcd", "aba"]

*/


public class AllLongestStrings {
    public static void main(String[] args) {
      inputArray = ["aba", "aa", "ad", "vcd", "aba"]
        System.out.println("Result: " + solution(inputArray));
    }

String[] solution(String[] inputArray) {


    int maxLength=0;
    int prevMaxLength=0;
    ArrayList<String> maxStringList = new ArrayList<>();
    //["a", "aa", "ad", "vcd", "aba", "abcde"]
 for(String obj: inputArray){
     
     if (maxLength <= obj.length())
         
         maxLength = obj.length();
         //maxStringList.add(obj);
     }
    
     for(String obj1: inputArray){
     
     if (maxLength <= obj1.length())
         
         maxStringList.add(obj1);
     }
     
 
 
 return maxStringList.toArray(new String[maxStringList.size()]);
}

}
