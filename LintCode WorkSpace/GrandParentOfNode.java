import java.util.*;

class TreeNodeG{
    int data;
    TreeNodeG left;
    TreeNodeG right;
    TreeNodeG(int data){
        this.data = data;
        left = right = null;
    }
}

    public class GrandParentOfNode {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<TreeNodeG,TreeNodeG> hmap = new HashMap<>();
        int nodes = sc.nextInt();
        TreeNodeG root = null;
        for(int i=0;i<nodes;i++){
            int currNode = sc.nextInt();
           root =  construcTree(root,currNode);
        }
//        printTree(root);
            parentMapFill(root,hmap);
            for(Map.Entry<TreeNodeG,TreeNodeG> hm:hmap.entrySet()){
                System.out.println("Children");
                System.out.print(hm.getKey().data+" ");
                System.out.println();
                System.out.println("Parent");
                System.out.println(hm.getValue().data+" ");
                System.out.println();
            }
            System.out.println("Enter To Find GrandParent For Particular Node");
            returnGParentNode(root,sc.nextInt(),hmap);
    }

    public static TreeNodeG construcTree(TreeNodeG root,int X){
        if(root == null)return new TreeNodeG(X);
        if(root.data>=X){
            root.left = construcTree(root.left,X);
        }
        else {
            root.right = construcTree(root.right,X);
        }
        return root;
    }

    public static void parentMapFill(TreeNodeG root,Map<TreeNodeG,TreeNodeG> hmap){
            if(root == null) return;
            Queue<TreeNodeG> q = new LinkedList<>();
            q.offer(root);
            while(!q.isEmpty()){
                TreeNodeG curr = q.poll();
                if(curr.left != null){
                    hmap.put(curr.left,curr);
                    q.add(curr.left);
                }
                if(curr.right !=null){
                    hmap.put(curr.right,curr);
                    q.add(curr.right);
                }
            }
    }

        public static void printTree(TreeNodeG root) {
            if (root != null) {
                System.out.print(root.data + " ");
                printTree(root.left);
                printTree(root.right);
            }
//            if(root == null) System.out.println("Y");
        }

        public static void returnGParentNode(TreeNodeG root,int target,Map<TreeNodeG,TreeNodeG> hmap){
            if(root == null) return;
            TreeNodeG targetStatus = findNode(root,target);
            if(targetStatus == null) System.out.println("There is no grand parent for given node");
           TreeNodeG GrandParentStatus =  hmap.get(hmap.get(targetStatus));
           if(GrandParentStatus == null) System.out.println("There is no grand parent for given node");
           else System.out.println("Your GrandParent For This Node is "+GrandParentStatus.data);
        }

        public static TreeNodeG findNode(TreeNodeG current,int target){
            if(current == null || current.data ==target) return current;
            if(current.data >=target){
               return findNode(current.left,target);
            }
            else {
               return findNode(current.right,target);
            }
        }
}
