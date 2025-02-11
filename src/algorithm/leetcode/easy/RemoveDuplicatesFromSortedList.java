package algorithm.leetcode.easy;

public class RemoveDuplicatesFromSortedList
{
    public ListNode deleteDuplicates(ListNode head) {
        ListNode now = head;

        if(now == null){
            return head;
        }

        while(now.next != null){
            if(now.val  == now.next.val){
                now.next = now.next.next;
            }else{
                now = now.next;
            }
        }

        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
