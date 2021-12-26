/*
IsLuckyNumber

Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

    For n = 1230, the output should be
    solution(n) = true;
    For n = 239017, the output should be
    solution(n) = false.


*/

public class IsLuckyNumber {
    public static void main(String[] args) {
       
        System.out.println("Result: " + solution(290092)
        System.out.println("Result: " + solution(239017)

    }
    
   
   boolean solution(int n) {


List<Integer> numList = new ArrayList<>();

while (n >0){  

    numList.add(n%10);
    n= n/10;
}


int leftSum =0, rightSum=0;
for(int i =0; i < numList.size() /2; i++){
        
     leftSum += numList.get(i);
     rightSum += numList.get(numList.size()-1-i);
    
    }

if(leftSum== rightSum)
    return true;
    else
    return false;

}

    
    
    }
