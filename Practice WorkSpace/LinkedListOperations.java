import java.util.*;
class ListNode{ // structure of one SLL Node
    int val;
    ListNode next;
    // Constructor - method - create/instantiate objects - alloc memory and init all members
    public ListNode(int v){
        val = v; next = null;
    }
}

class LinkedListOperations{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Solution sol = new Solution();
        ListNode h = null; // head of LL (empty)
        int n = sc.nextInt();
        while(n-->0){
            int x = sc.nextInt();
            h = sol.insertAtBegin(h, x);
        }
        sol.printLL(h);
        System.out.println();
//        int findPrev = sc.nextInt();
//        ListNode ans = sol.findPrevOf(h, findPrev);
//        if(ans == null)
//            System.out.println("null");
//        else
//            System.out.println(ans.val);

        ListNode find = sol.returnK(h, sc.nextInt());
        if(find == null)
            System.out.println("null");
        else
            System.out.println(find.val);
    }
}
class Solution {
    // params - where to insert, what to insert
    // returns - new head after insertion
    ListNode insertAtBegin(ListNode h, int x){
        ListNode nn = new ListNode(x); // new node
        nn.next = h;
        return nn; // new head
    }
    void printLL(ListNode h){
        ListNode t = h;
        while(t != null){
            System.out.print(t.val + " ");
            t = t.next;
        }
    }

    int countX(ListNode h, int x){
        ListNode t = h;
        int c = 0;
        while(t != null){
            if(t.val == x)
                c++;
            t = t.next;
        }
        return c;
    }
    // sum of elems
// max/min val
    ListNode find(ListNode h, int x){
        ListNode t = h;
        while(t != null){
            if(t.val == x)
                return t;
            t = t.next;
        }
        return null;
    }
    ListNode findPrevOf(ListNode h, int x){
        ListNode p = null, t = h; // prev & temp
        while(t != null){
            if(t.val == x)
                return p;
            p = t;
            t = t.next;
        }
        return null;
    }

    ListNode returnK(ListNode h,int k)
    {
        System.out.println(h);
        if(h==null) return null;
        ListNode t = h;
        int count = 0;
        while(t!=null && t.next!=null && t.next.next!=null)
        {
           count++;
           t= t.next;
        }
        int jumps = count - k;
        t = h;
        if(jumps<0) return null;
        while(jumps-->0)
        {
            t=t.next;
        }
        return t;
    }
}
