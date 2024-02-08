import java.util.*;

class TreeNode {
    TreeNode left;
    int data;
    TreeNode right;

    TreeNode(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }
}

public class ParentOfNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();

        // Initialize root as null
        TreeNode root = null;

        for (int i = 0; i < nodes; i++) {
            int nodeVal = sc.nextInt();
            root = constructBST(root, nodeVal);
        }

//        Finding the parent for children
        Map<TreeNode,TreeNode> hmap = new LinkedHashMap<>();
        findParent(root,hmap);
        for(Map.Entry<TreeNode,TreeNode> hm:hmap.entrySet()){
            System.out.println("Children");
            System.out.print(hm.getKey().data+" ");
            System.out.println();
            System.out.println("Parent");
            System.out.println(hm.getValue().data+" ");
            System.out.println();
        }

    }

    public static TreeNode constructBST(TreeNode root, int x) {
        if (root == null) return new TreeNode(x);

        if (root.data >= x) {
            root.left = constructBST(root.left, x);
        } else {
            root.right = constructBST(root.right, x);
        }

        return root;
    }

    public static void printTree(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            printTree(root.left);
            printTree(root.right);
        }
    }

    public static void findParent(TreeNode root,Map<TreeNode,TreeNode> parentmap){
        if(root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode rem = q.poll();
            if(rem.left !=null){
            parentmap.put(rem.left,rem);
            q.add(rem.left);
            }
            if(rem.right !=null) {
                parentmap.put(rem.right,rem);
                q.add(rem.right);
            }
        }
    }
}
