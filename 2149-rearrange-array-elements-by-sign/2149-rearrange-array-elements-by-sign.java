class Solution {
    public int[] rearrangeArray(int[] nums) {
    int n=nums.length,c=0,d=0;
    int[] a=new int[n/2];
    int[] b=new int[n/2];
    for(int i=0;i<n;i++)
    {if(nums[i]>0) a[c++]=nums[i];
    else b[d++]=nums[i];
    }
    c=0;
    d=0;
    for(int i=0;i<n;i++)
    {if(i%2==0) nums[i]=a[c++];
    else nums[i]=b[d++];
    }
    return nums;
    }
}