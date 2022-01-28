/*
CodeMaster has just returned from shopping. He scanned the check of the items he bought and gave the resulting string to Ratiorg to figure out the total number of purchased items. Since Ratiorg is a bot he is definitely going to automate it, so he needs a program that sums up all the numbers which appear in the given input.

Help Ratiorg by writing a function that returns the sum of numbers that appear in the given inputString.

Example

For inputString = "2 apples, 12 oranges", the output should be
solution(inputString) = 14.
*/

public class SumUpNumbers{
  
  
  int solution(String inputString) {

if(inputString== null || inputString.equals(""))
    return 0;


String [] arr= inputString.split("\\D+");

int total=0;

for(String s : arr)
{
    System.out.println("s-> "+s );
    if(!s.isEmpty())
         total += Integer.parseInt(s);
    
    
}
return total;
}

  
  
}
