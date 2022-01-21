/*
Given a binary tree t, determine whether it is symmetric around its center, i.e. each side mirrors the other.

Example

    For

    t = {
        "value": 1,
        "left": {
            "value": 2,
            "left": {
                "value": 3,
                "left": null,
                "right": null
            },
            "right": {
                "value": 4,
                "left": null,
                "right": null
            }
        },
        "right": {
            "value": 2,
            "left": {
                "value": 4,
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

    the output should be solution(t) = true.

    Here's what the tree in this example looks like:

        1
       / \
      2   2
     / \ / \
    3  4 4  3

    As you can see, it is symmetric.

    For

    t = {
        "value": 1,
        "left": {
            "value": 2,
            "left": null,
            "right": {
                "value": 3,
                "left": null,
                "right": null
            }
        },
        "right": {
            "value": 2,
            "left": null,
            "right": {
                "value": 3,
                "left": null,
                "right": null
            }
        }
    }

    the output should be solution(t) = false.

    Here's what the tree in this example looks like:

        1
       / \
      2   2
       \   \
       3    3

    As you can see, it is not symmetric.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] tree.integer t

    A binary tree of integers.

    Guaranteed constraints:
    0 ≤ tree size < 5 · 104,
    -1000 ≤ node value ≤ 1000.

    [output] boolean

    Return true if t is symmetric and false otherwise.


*/

public class IsTreeSymmetric{
  
  //
// Binary trees are already defined with this interface:
// class Tree<T> {
//   Tree(T x) {
//     value = x;
//   }
//   T value;
//   Tree<T> left;
//   Tree<T> right;
// }
boolean solution(Tree<Integer> t) {

return isMirrorOrSymmetric(t, t);
}


boolean isMirrorOrSymmetric(Tree<Integer> t1, Tree<Integer> t2)
{
    
    if( t1== null && t2==null) return true;
    
    if( t1== null || t2== null) return false;
    
    return (t1.value).equals(t2.value)
        && isMirrorOrSymmetric(t1.right, t2.left)
        && isMirrorOrSymmetric(t1.left, t2.right);
    
}

  
  
}
