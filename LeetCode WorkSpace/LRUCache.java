import java.util.*;
// structure for a LL Node
class CDLLNode {
    int key, value;
    CDLLNode prev, next;
    public CDLLNode(int key, int value){
        this.key = key; this.value = value;
        this.prev = this.next = null;
    }
}
class CDLL {
    CDLLNode head = null; // Empty CDLL
    CDLLNode insertAtBegin(int key, int value){
        CDLLNode nn = new CDLLNode(key, value);
        nn.next = nn; nn.prev = nn;
        if(head == null){
            head = nn;
        } else {
            CDLLNode last = head.prev;
            nn.next = head; head.prev = nn;
            last.next = nn; nn.prev = last;
            head = nn;
        }
        return nn;
    }
    void printCDLL(){
        if(head == null) return;
        CDLLNode last = head.prev;
        CDLLNode temp = head;
        while(true){
            System.out.print(temp.key + "," + temp.value + "   ");
            if(temp == last)
                break;
            temp = temp.next;
        }
    }
    int delLastNode(){
        if(head == null) return -1;
        CDLLNode last = head.prev;
        if(head == last) head = null; // single node
        else{  // multi node disconnect last node
            last.prev.next = head;
            head.prev = last.prev; // here deleting the last node so putting in head prev of last prev value
        }
        return last.prev.value;
    }
    void moveNodeInBegin(CDLLNode node){
        if(head == node){
            return; // node is already in front
        }
        else{
            node.prev.next = node.next;
            node.next.prev = node.prev;
            CDLLNode last = head.prev;
            node.next = head;
            head.prev = node;
            last.next = node;
            node.prev = last;
            head = node;
        }
    }
}
class LRU{
    int capacity;
    int size;
    CDLL ll;
    Map<Integer,CDLLNode> mp;

    public LRU(int capacity){
        this.capacity  = capacity;
        this.size = 0;
        this.ll = new CDLL();
        mp = new HashMap<>();
    }

    public int get(int key){
        if(mp.containsKey(key)){
           CDLLNode node =  mp.get(key);
           ll.moveNodeInBegin(node);
           return node.value;
        }
        else{
            return -1;
        }
    }

    void put(int key,int value){
        if(mp.containsKey(key)){
            CDLLNode node = mp.get(key);
            node.value = value;
            ll.moveNodeInBegin(node);
        }
        else{
            if(size<capacity){

            }
            else{
                int delkey = ll.delLastNode();
                mp.remove(delkey);
                CDLLNode nn = ll.insertAtBegin(key,value);
                mp.put(key,nn);
            }
        }
    }

}

class LRUCache{
    public static void main(String[] args) {
        CDLL ll = new CDLL();
        ll.insertAtBegin(0, 0);
        ll.insertAtBegin(1,1);
        ll.insertAtBegin(2,2);
        ll.printCDLL();
        ll.moveNodeInBegin(ll.head.prev);
        ll.printCDLL();
    }
}
