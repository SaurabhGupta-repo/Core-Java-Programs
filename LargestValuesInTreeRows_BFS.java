/*
You have a binary tree t. Your task is to find the largest value in each row of this tree. In a tree, a row is a set of nodes that have equal depth. For example, a row with depth 0 is a tree root, a row with depth 1 is composed of the root's children, etc.

Return an array in which the first element is the largest value in the row with depth 0, the second element is the largest value in the row with depth 1, the third element is the largest element in the row with depth 2, etc.

Example

For

t = {
    "value": -1,
    "left": {
        "value": 5,
        "left": null,
        "right": null
    },
    "right": {
        "value": 7,
        "left": null,
        "right": {
            "value": 1,
            "left": null,
            "right": null
        }
    }
}

the output should be solution(t) = [-1, 7, 1].

The tree in the example looks like this:

    -1
   / \
  5   7
       \
        1

    In the row with depth 0, there is only one vertex - the root with value -1;
    In the row with depth 1, there are two vertices with values 5 and 7, so the largest value here is 7;
    In the row with depth 2, there is only one vertex with value 1.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] tree.integer t

    A binary tree of integers.

    Guaranteed constraints:
    0 ≤ tree size ≤ 5 · 104,
    -1000 ≤ node value ≤ 1000.

    [output] array.integer

    An array of the largest values in each row of t
*/

public class LargestValuesInTreeRows_BFS{
  
  
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
    if (t == null) {
        return new int[0];
    }
    Queue<Tree<Integer>> queue = new LinkedList<>();
    queue.offer(t);
    List<Integer> levelMax = new ArrayList<>();
    
    while (!queue.isEmpty()) {
        int size = queue.size();
        int tmpMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            Tree<Integer> cur = queue.poll();
            if (cur.value > tmpMax) {
                tmpMax = cur.value;
            }
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
        levelMax.add(tmpMax);
    }
    int[] result = new int[levelMax.size()];
    for (int i = 0; i < levelMax.size(); i++) {
        result[i] = levelMax.get(i);
    }
    return result;
}

  
  
}
