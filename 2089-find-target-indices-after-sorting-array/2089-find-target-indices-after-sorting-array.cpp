class Solution {
public:
    vector<int> targetIndices(vector<int>& nums, int target) {
    sort(nums.begin(),nums.end());
    vector<int>a;
    int c=0;
    for(int i=0;i<nums.size();i++)
    {if(nums[i]==target)
    {c++;
    a.push_back(i);
    }
    else if(c>0) break;
    }
    return a;   
    }
};