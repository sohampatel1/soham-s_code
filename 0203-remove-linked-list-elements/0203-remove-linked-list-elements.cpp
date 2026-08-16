/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeElements(ListNode* head, int val) {
    ListNode* t=head;
    ListNode* c=new ListNode(0);
    ListNode* b=c;
    while(t!=NULL)
    {if(t->val!=val)
    {b->next=new ListNode(t->val);
    b=b->next;
    }
    t=t->next;
    }
    return c->next;    
    }
};