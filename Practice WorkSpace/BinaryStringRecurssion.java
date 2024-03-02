import java.util.*;
public class BinaryStringRecurssion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        List<String> ans = new ArrayList<>();
        helper(n,sb,ans,3,0);
        System.out.println(ans);
        int k = sc.nextInt();
        printbinStrings0fLenK(ans,k);
    }
    public static void helper(int n, StringBuilder path,List<String> ans,int k,int countOf1){
        if(path.length()==n){
            if(countOf1 ==k)
            ans.add(path.toString());
            return;
        }
            path.append('0');
            helper(n,path,ans,k,countOf1);
            path.setLength(path.length()-1);

            path.append('1');
            helper(n,path,ans,k,countOf1+1);
            path.setLength(path.length()-1);
    }
    public static void printbinStrings0fLenK(List<String> ans,int k){

    }

}
