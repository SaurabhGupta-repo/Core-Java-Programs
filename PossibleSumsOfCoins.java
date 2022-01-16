/*
You have a collection of coins, and you know the values of the coins and the quantity of each type of coin in it. You want to know how many distinct sums you can make from non-empty groupings of these coins.

Example

For coins = [10, 50, 100] and quantity = [1, 2, 1], the output should be
solution(coins, quantity) = 9.

Here are all the possible sums:

    50 = 50;
    10 + 50 = 60;
    50 + 100 = 150;
    10 + 50 + 100 = 160;
    50 + 50 = 100;
    10 + 50 + 50 = 110;
    50 + 50 + 100 = 200;
    10 + 50 + 50 + 100 = 210;
    10 = 10;
    100 = 100;
    10 + 100 = 110.

As you can see, there are 9 distinct sums that can be created from non-empty groupings of your coins.


*/


public class PossibleSumsOfCoins
{
  
 int solution(int[] coins, int[] quantity) {

/*
Clue: Make the hash table's keys the possible sums (or a set containing the possible sums).
        Start empty, and add new coins to it. When adding a new coin, you only need to consider the results you get from adding coins to a previous possible result.

*/
    HashSet<Integer> sums = new HashSet<Integer>();
    sums.add(0);  // tart empty, and add new coins to it.
    
    for(int i=0; i<coins.length; i++) {
        int coin = coins[i];
        HashSet<Integer> currentSums = new HashSet<Integer>();
        for(Integer sum : sums) {
            for(int j=1; j<=quantity[i]; j++) {
                currentSums.add(sum + coin*j);
            }
        }
        sums.addAll(currentSums);
    }
    
    return sums.size() - 1;
}


 
  
  
}
