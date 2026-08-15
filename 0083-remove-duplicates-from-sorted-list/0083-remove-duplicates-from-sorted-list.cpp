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
        if(head==NULL) return head;
      ListNode* b=head;
     ListNode* temp=head;
     temp=temp->next;
     while(temp!=NULL)
     {if(b->val!=temp->val)
     {b=b->next;
     b->val=temp->val;
     }
     temp=temp->next;
     if(temp==NULL)
     {b->next=NULL;
     break;
     }
     }
     return head;   
    }
};