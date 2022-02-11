/*
Note: Try to solve this task without using recursion, since this is what you'll be asked to do during an interview.

Given a binary tree of integers t, return its node values in the following format:

    The first element should be the value of the tree root;
    The next elements should be the values of the nodes at height 1 (i.e. the root children), ordered from the leftmost to the rightmost one;
    The elements after that should be the values of the nodes at height 2 (i.e. the children of the nodes at height 1) ordered in the same way;
    Etc.

Example

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
        "value": 4,
        "left": {
            "value": 5,
            "left": null,
            "right": null
        },
        "right": null
    }
}

the output should be
solution(t) = [1, 2, 4, 3, 5].

This t looks like this:

     1
   /   \
  2     4
   \   /
    3 5

Input/Output

    [execution time limit] 3 seconds (java)

    [input] tree.integer t

    Guaranteed constraints:
    0 ≤ tree size ≤ 104.

    [output] array.integer

    An array that contains the values at t's nodes, ordered as described above.

*/

public class TraverseTree{
  
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
int[] solution(Tree<Integer> t) {
    
    // Traverse tree using BFS
    if (t == null) return new int[] {};
    
    List<Integer> result = new ArrayList<Integer>();
    Queue<Tree<Integer>> q = new LinkedList<Tree<Integer>>();
    q.add(t);   
    
    while (!q.isEmpty()) {
        Tree<Integer> current = q.poll();
        result.add(current.value);
        
        if (current.left != null)
            q.add(current.left);
        if (current.right != null)
            q.add(current.right);    
    }
        
    return result.stream().mapToInt(Integer::intValue).toArray();
}

  
  
}
