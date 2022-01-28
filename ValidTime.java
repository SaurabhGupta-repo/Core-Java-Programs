/*
Check if the given string is a correct time representation of the 24-hour clock.

Example

    For time = "13:58", the output should be
    solution(time) = true;
    For time = "25:51", the output should be
    solution(time) = false;
    For time = "02:76", the output should be
    solution(time) = false
*/

public class ValidTime{
  
  
 boolean solution(String time) {


String [] timeArr= time.split(":");

if (timeArr.length <1)
return false;


int hr= Integer.parseInt(timeArr[0]);
int min = Integer.parseInt(timeArr[1]);
if( (hr >=0 && hr  <=23) && (min >=0 && min  <=59) )
return true;

else return false;

}
 
}
