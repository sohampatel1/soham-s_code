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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
    ListNode dummy(0);   
    ListNode* s = &dummy;
    ListNode* t1 = list1;
    ListNode* t2 = list2;

    while(t1 != nullptr && t2 != nullptr) {
        if(t1->val == t2->val) {
            s->next = t1;
            s = s->next;
            t1 = t1->next; 
            
            s->next = t2;
            s = s->next;
            t2 = t2->next;
        }
        else if(t1->val < t2->val) {
            s->next = t1;
            t1 = t1->next;
            s = s->next;
        }
        else {
            s->next = t2;
            t2 = t2->next;
            s = s->next;
        }
    }

    while(t1 != nullptr) {
        s->next = t1;
        t1 = t1->next;
        s = s->next;
    }

    while(t2 != nullptr) {
        s->next = t2;
        t2 = t2->next;
        s = s->next;
    }

    return dummy.next;   
    }
};
