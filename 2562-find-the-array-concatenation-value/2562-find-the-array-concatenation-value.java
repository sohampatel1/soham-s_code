class Solution {
    public long findTheArrayConcVal(int[] nums) {
    long s=0;
    String ans;
    int n=nums.length;
    if(n==1) return nums[0];
    for(int i=0;i<(n)/2;i++)
    {ans=Integer.toString(nums[i])+Integer.toString(nums[n-1-i]);
    long a=Long.parseLong(ans);
    s+=a;
    }
    if(n%2!=0) s+=nums[n/2];
    return s;    
    }
}