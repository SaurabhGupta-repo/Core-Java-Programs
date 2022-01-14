/*
Given an array strings, determine whether it follows the sequence given in the patterns array. In other words, there should be no i and j for which strings[i] = strings[j] and patterns[i] ≠ patterns[j] or for which strings[i] ≠ strings[j] and patterns[i] = patterns[j].

Example

    For strings = ["cat", "dog", "dog"] and patterns = ["a", "b", "b"], the output should be
    solution(strings, patterns) = true;
    For strings = ["cat", "dog", "doggy"] and patterns = ["a", "b", "b"], the output should be
    solution(strings, patterns) = false.


*/

public class AreFollowingPatterns
{
  // A hashMap can be used to solve this problem. As pattern[i] should always be equal to string[i].
  
  Map<String, String> map = new HashMap<>(); // map<pattern, strings>

    for(int i =0; i < strings.length; i++)
    {
        if(map.containsKey(patterns[i]))
        {
		    if(!map.get(patterns[i]).equals(strings[i])) 
            return false;
		}
        else if(map.containsValue(strings[i]))
        {
		    return false;
		}
		
        map.put(patterns[i], strings[i]);
	}
		     
   return true;
}

  
}
