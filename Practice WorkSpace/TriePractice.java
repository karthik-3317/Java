import java.util.*;
class TNode{
    boolean isEndOfWord;
    TNode[] children;
    public TNode(){
        isEndOfWord = false;
        children = new TNode[26]; // ALPHABET_SIZE
    }
}
public class TriePractice {
    TNode root = new TNode();
//    Store a new word in trie dictionary
    void insertWord(String word){
        TNode temp = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int idx = ch - 'a';
            if(temp.children[idx]==null){
                TNode nn = new TNode();
                temp.children[idx] = nn;
            }
            temp = temp.children[idx];
        }
        temp.isEndOfWord  = true;
    }
    boolean hasWord(String str){
        TNode temp = root;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int idx = ch - 'a';
            if(temp.children[idx]==null) return false;
            temp = temp.children[idx];
        }
        return temp.isEndOfWord;
    }
}

class MainTrie{
    public static void main(String[] args) {
        TriePractice trie = new TriePractice();
        trie.insertWord("car");
        System.out.println( trie.hasWord("car"));
    }
}
