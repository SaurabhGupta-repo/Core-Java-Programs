/*
Given a string, your task is to replace each of its characters by the next one in the English alphabet; i.e. replace a with b, replace b with c, etc (z would be replaced by a).

Example

For inputString = "crazy", the output should be solution(inputString) = "dsbaz".

*/

public class AlphabeticShift{
  
String solution(String inputString) {

  char [] chArray = inputString.toCharArray();
  int val=0;
  for(int i =0; i < chArray.length; i++)
  {
    
    if (chArray[i] =='z')
          chArray[i] ='a';  
    else  
    {
        val =  (int) chArray[i];
        ++val;
        chArray[i] = (char) val;
    }
  }
        inputString = new String(chArray);
return inputString;
}

  
  
}
