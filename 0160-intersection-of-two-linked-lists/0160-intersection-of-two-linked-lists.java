/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode t=headA;
    HashSet<ListNode>a=new HashSet<>();
    while(t!=null)
    {a.add(t);
    t=t.next;
    }
    t=headB;
    while(t!=null)
    {if(a.contains(t)) return t;
    t=t.next;
    }   
  return null;
    }
}