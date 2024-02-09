//import java.util.*;
//
//public class LevelOrder {
//    List<List<Integer>> lst = new ArrayList<>();
//    int root = 2;
//    Queue<Integer> q = new LinkedList<>();
//    q.push(2);
//    while(!q.empty()){
//        List<Integer> sublist = new ArrayList<>();
//        int size = q.size();
//        for(int i=0;i<size;i++) {
//            root = q.remove();
//            sublist.add(root.data);
//            if (root.left != null) q.push(root.left);
//            if (root.right != null) q.push(root.right);
//        }
//        list.add(sublist);
//    }
////    return lst;
//}
