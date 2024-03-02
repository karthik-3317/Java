import java.util.*;
class TNode2{
    boolean isEOW;
    TNode2[] children;
    public TNode2(){
        this.isEOW = false;
        children = new TNode2[26];
    }
}

public class TriePrintingAllWords {
    static TNode2 root = new TNode2();  // trie will always have root
    static void insertWord(String word){
        TNode2 temp = root;
        for(char ch:word.toCharArray()){
            int idx = ch - 'a';
            if(temp.children[idx]==null){
                TNode2 nn = new TNode2();
                temp.children[idx] = nn;
            }
            temp = temp.children[idx];
        }
        temp.isEOW = true;
    }
    static boolean hadWord(String word){
        TNode2 temp = root;
        for(char ch:word.toCharArray()){
            int idx = ch - 'a';
            if(temp.children[idx]==null){
               return false;
            }
            temp = temp.children[idx];
        }
        return temp.isEOW;
    }
    static List<String> printAllWords(){
        List<String> ans = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        helper(root,path,ans);
        return ans;
    }
    static List<String> autoSuggest(String prefix){
        List<String> ans = new ArrayList<>();
        TNode2 temp = root;
        for(char ch:prefix.toCharArray()){
            int idx = ch - 'a';
            if(temp.children[idx]==null){
                return ans;
            }
            temp = temp.children[idx];
        }
        helper(root,new StringBuilder(),ans);
        return ans;
    }
    static void helper(TNode2 root,StringBuilder path, List<String> ans){
        if(root.isEOW){
            ans.add(path.toString());
        }
        for (int i = 0;i<26;i++){
            if(root.children[i]!=null){
                path.append((char) (i + 'a')); // choose
                helper(root.children[i],path,ans); // explore
                path.setLength(path.length()-1); // un choose
            }
        }
    }
    public static void main(String[] args) {
        insertWord("car");
        insertWord("cart");
        insertWord("carry");
        insertWord("card");
        insertWord("cards");
        insertWord("carrys");
        insertWord("cargon");
        insertWord("cars");
        insertWord("carrot");
        insertWord("carrots");
        insertWord("cargo");
        StringBuilder path = new StringBuilder();
        List<String> ans = new ArrayList<>();
//        helper(root,path,ans);
//        System.out.println(ans);
        System.out.println(autoSuggest("carr"));
    }
}
// ideone link -- https://ideone.com/wN43zr
