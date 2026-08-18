class Solution {
    public int triangularSum(int[] nums) {
    int x=nums.length;
    int a[][]= new int[x][x];
    for(int i=0;i<x;i++)
    {a[0][i]=nums[i];}
    int z=x-1;
    for(int i=1;i<x;i++)
    {for(int j=0;j<z;j++)
    {
    a[i][j]=a[i-1][j]+a[i-1][j+1]; 
    if(a[i][j]>9)
    {a[i][j]=(a[i][j])%10;}
    }
    z--;
    }
    int ans=a[x-1][0];
    return ans;   
    }
}