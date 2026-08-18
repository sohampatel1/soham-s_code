class Solution {
    public int maxArea(int[] height) {
    int max=0,n=height.length,l=0,r=n-1;
    while(l<=r)
   {int s=Math.min(height[l],height[r])*(r-l);
    if(height[l]<height[r]) l++;
    else r--;
    if(max<s) max=s;
   }
   return max;
    }
}