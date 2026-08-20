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
    ListNode* deleteDuplicates(ListNode* head) {
    ListNode*t=new ListNode(0);
    ListNode*t2=t;
  int  prev=-101;
    while(head!=NULL)
    {if((prev!=head->val&&head->next==NULL)||(prev!=head->val&&head->next->val!=head->val))
    {t->next=new ListNode(head->val);
    t=t->next;
    }
    prev=head->val;
    head=head->next;
    }
   return t2->next;
 }
};