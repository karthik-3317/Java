import java.util.*;
class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
  }
class Pair{
    TreeNode node = null;
    TreeNode parent= null;
    public Pair(TreeNode node,TreeNode parent)
    {
        this.node = node;
        this.parent = parent;
    }
}

public class CousinsOfTree {
    public static  ArrayList<Integer> solve(TreeNode root, int B) {
        if(root== null) return new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,null));
        boolean foundB = false;
        TreeNode parentOfB = null;
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Pair> innerList = new ArrayList<>();
            while(size-->0)
            {
                Pair p = q.remove();
                innerList.add(p);
                if(p.node.val == B)
                {
                    foundB = true;
                    parentOfB = p.parent;
                }
                if(p.node.right!=null) q.add(new Pair(p.node.right,p.node));
                if(p.node.left!=null) q.add(new Pair(p.node.left,p.node));
            }
            if(foundB)
            {
                for(Pair p:innerList)
                {
                    if(p.parent!=parentOfB)
                        arr.add(p.node.val);
                }
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
//        solve(new TreeNode(),6);  // at here only give the tree structure then stars working
    }
}
