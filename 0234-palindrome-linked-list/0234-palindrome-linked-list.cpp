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
    bool isPalindrome(ListNode* head) {
    vector<int>a;
    ListNode*t=head;
    int c=0;
    while(t!=NULL)
    {c++;
    a.push_back(t->val);
    t=t->next;
    }
    if(c==1) return true;
    for(int i=0;i<c/2;i++)
    {if(a[i]!=a[c-1-i]) return false;
    }
    return true;
    }
};