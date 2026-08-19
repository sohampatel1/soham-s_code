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
    int getDecimalValue(ListNode* head) {
    vector<int>a;
    while(head!=NULL)
    {a.push_back(head->val);
    head=head->next;
    }
    int s=0,n=a.size();
    for(int i=0;i<n;i++)
    {s+=a[n-1-i]*pow(2,i);
    }
    return s;   
    }
};