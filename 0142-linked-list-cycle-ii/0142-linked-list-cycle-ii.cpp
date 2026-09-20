/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
    int c=0;
    unordered_set<ListNode*>a;
    while(head!=NULL)
    {if(a.contains(head)==true) return head;
    else a.insert(head);
    head=head->next;    
    }
    return NULL;
    }
};