/*
We're going to store numbers in a tree. Each node in this tree will store a single digit (from 0 to 9), and each path from root to leaf encodes a non-negative integer.

Given a binary tree t, find the sum of all the numbers encoded in it.

Example

    For

t = {
    "value": 1,
    "left": {
        "value": 0,
        "left": {
            "value": 3,
            "left": null,
            "right": null
        },
        "right": {
            "value": 1,
            "left": null,
            "right": null
        }
    },
    "right": {
        "value": 4,
        "left": null,
        "right": null
    }
}

the output should be
solution(t) = 218.
There are 3 numbers encoded in this tree:

    Path 1->0->3 encodes 103
    Path 1->0->1 encodes 101
    Path 1->4 encodes 14
    and their sum is 103 + 101 + 14 = 218.

t = {
    "value": 0,
    "left": {
        "value": 9,
        "left": null,
        "right": null
    },
    "right": {
        "value": 9,
        "left": {
            "value": 1,
            "left": null,
            "right": null
        },
        "right": {
            "value": 3,
            "left": null,
            "right": null
        }
    }
}

the output should be
solution(t) = 193.
Because 09 + 091 + 093 = 193
*/

public class DigitTreeSum{
  
  //
// Definition for binary tree:
// class Tree<T> {
//   Tree(T x) {
//     value = x;
//   }
//   T value;
//   Tree<T> left;
//   Tree<T> right;
// }
long solution(Tree<Integer> t) {
  
  /* clue: Implement DFS. Instead of just storing the node visited in the stack, store lists 
  (or list-like objects such as struct, or tuple) instead. The first element of the list is the node visited,
  and the second element in the list is the number constructed so far from the root to the current node (the prefix).
    You can get the prefix for the children of node current by calculating 10*prefix + current.value
*/
    return recursion(t, 0);
}

private long recursion(Tree<Integer> t, long result) {
    long total = 0;
    if (t.left == null && t.right == null) {
        total += (result * 10) + t.value;
    }
    if (t.left != null) {
        total += recursion(t.left, (result * 10) + t.value);
    }
    if (t.right != null) {
        total += recursion(t.right, (result * 10) + t.value);
    }
    return total;
}

  
}
