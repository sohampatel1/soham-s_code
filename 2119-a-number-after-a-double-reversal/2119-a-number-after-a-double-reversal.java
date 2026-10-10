class Solution {
    public boolean isSameAfterReversals(int num) { 
    if(num==0) return true;
    int r=num%10;
    if(r!=0) return true;
    return false; 
    }
}