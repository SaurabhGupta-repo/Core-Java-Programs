/*
AddBorderToElementsInStringArray

Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]

the output should be

solution(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]



*/

public class AddBorderToElementsInStringArray
{
  
String[] solution(String[] picture) {

String astrik="*";

String soln []= new String [ picture.length+2];

int len=0;
for( int i =0; i<picture.length; i++)
{
    if(len< picture[i].length())
        len= picture[i].length();
    soln[i+1] = astrik+ picture[i] + astrik;
    
    
}


//// Tip: replaceAll uses regex - for more details: https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html#sum
soln[0]= soln[soln.length-1] = soln[1].replaceAll(".","*");

return soln;
}




}
