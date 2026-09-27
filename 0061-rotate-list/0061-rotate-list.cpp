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
    ListNode* rotateRight(ListNode* head, int k) {
    if(head==NULL) return NULL;
    ListNode* t=head;
    int c=0;
    while(t->next!=NULL)
    { t=t->next; 
    c++;}
    c++;
    t->next=head;
    k=k%c;
    if(k==0)
    {t->next=NULL;
    return head;
    }
    int s=c-k;
    while(s>0) 
    {t=t->next;
     s--;}
    head=t->next;
    t->next=NULL;
    return head;
    }
};