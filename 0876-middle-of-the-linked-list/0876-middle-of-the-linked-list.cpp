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
    ListNode* middleNode(ListNode* head) {
    ListNode* b=new ListNode(0);
    ListNode*t=head;
    ListNode* ans=b;
    int c=0,n;
    while(t!=NULL)
    {c++;
    t=t->next;
    }
    n=c/2;
    t=head;
    for(int i=0;i<c;i++)
    {if(i>=n)
    {b->next=new ListNode(t->val);
    b=b->next;
    }
    t=t->next;
    }
    t=ans->next;
    return t;
    }
};