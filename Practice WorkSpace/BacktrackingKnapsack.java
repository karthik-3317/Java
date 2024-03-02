import java.util.*;
public class BacktrackingKnapsack {
    public static void main(String[] args) {
//        write all parameters required
    }
    boolean helper(int[] w,int tar,int i,List<Integer> path,List<List<Integer>> ans){
        if(tar == 0){
            ans.add(new ArrayList<>(path));
            return true;
        }
        if(i>=w.length){
            return false;
        }
        boolean exc = helper(w,tar,i+1,path,ans);

        boolean inc = false;
        if(w[i]<=tar){
            path.add(w[i]);
            inc = helper(w,tar,i+1,path,ans);
            path.remove(path.size()-1);
        }
        return exc || inc;
    }
}
