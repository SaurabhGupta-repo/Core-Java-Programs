/*
Given two binary trees t1 and t2, determine whether the second tree is a subtree of the first tree. A subtree for vertex v in a binary tree t is a tree consisting of v and all its descendants in t. Determine whether or not there is a vertex v (possibly none) in tree t1 such that a subtree for vertex v (possibly empty) in t1 equals t2.

*/

public class IsSubtree{
  
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
boolean solution(Tree<Integer> t1, Tree<Integer> t2) {
    if (t2 == null) 
        return true;

    if (t1 == null)
        return false;

    if (areIdentical(t1, t2)) 
        return true;
    
    return solution(t1.left, t2)
            || solution(t1.right, t2);
}


boolean areIdentical(Tree<Integer> root1, Tree<Integer> root2) {
    if (root1 == null && root2 == null)
        return true;
    if (root1 == null || root2 == null)
        return false;
    return (root1.value.equals(root2.value)
            && areIdentical(root1.left, root2.left)
            && areIdentical(root1.right, root2.right));
}

  
  
}
