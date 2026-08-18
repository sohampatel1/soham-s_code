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
    ListNode* reverseList(ListNode* head) {
    if(head==NULL) return head;
    vector<ListNode*>a;
    int c=0;
    while(head->next!=NULL)
    {a.push_back(head);
    head=head->next;
    c++;
    }
    int n=a.size();
    ListNode* t=head;
    head->next=NULL;
    for(int i=0;i<c;i++)
    {head->next=a[c-1-i];
    head=head->next;
    }
    head->next=NULL;
    return t;
    }
};