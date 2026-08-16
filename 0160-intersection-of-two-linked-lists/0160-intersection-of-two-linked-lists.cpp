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
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
    std::unordered_set<ListNode*>a;
    ListNode* t=headA;
    while(t!=NULL)
    {a.insert(t);
    t=t->next;
    }
    t=headB;
    while(t!=NULL)
    {if(a.count(t)) return t;
    t=t->next;
    }
    return NULL;    
    }
};