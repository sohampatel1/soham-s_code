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
    vector<int> nodesBetweenCriticalPoints(ListNode* head) {
    vector<int>a;
    int fn=2147483647,ln=-1,sl=-1,c=-1,mn=2147483647;
    ListNode*t=head->next;
    int ans=head->val;
    c++;
    while(t->next!=NULL)
    {
    if(ans < t->val&&t->val > t->next->val)
    {sl=ln;
    ln=c;
    if(fn>c)fn=c;
    if(sl!=-1 && (ln-sl)<mn)mn=ln-sl;
    }
    else if(ans > t->val&& t->val < t->next->val)
    {sl=ln;
    ln=c;
    if(fn>c)fn=c;
    if(sl!=-1 && (ln-sl)<mn)mn=ln-sl;
    }
    ans=t->val;
    t=t->next;
    c++;
    }
    if(fn!=2147483647&&fn==ln)
    {a.push_back(-1);
    a.push_back(-1);
    }
    else if(fn==sl && sl!=ln && fn!=2147483647)
    {a.push_back(ln-fn);
     a.push_back(ln-fn);
    }
    else if(fn<sl && sl<ln &&fn!=2147483647)
    {a.push_back(mn);
    a.push_back(ln-fn);
    }
    else
    {a.push_back(-1);
    a.push_back(-1);
    }
    return a;
    }
};