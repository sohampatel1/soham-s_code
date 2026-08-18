class Solution {
    public int[] productExceptSelf(int[] nums) {
    int n=nums.length,p=1,c=0;
    int a[]=new int[n];
    for(int i:nums)
    {if(i!=0) p*=i;
    if(i==0) c++;}
    for(int i=0;i<n;i++) 
    {if((c>0 && nums[i]!=0)||c>1) a[i]=0;
    else if(nums[i]==0) a[i]=p;
    else a[i]=p/nums[i]; 
    }
    return a;
    }
}