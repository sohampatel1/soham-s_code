class Solution {
    public boolean checkDivisibility(int n) {
    String s= Integer.toString(n);
    int sum=0,mult=1;
    if(s.length()==1)return false;
    for(int i=0;i<s.length();i++)
    {int a=s.codePointAt(i)-48;
    sum+=a;
    mult*=a;
    }
    if(n%(sum+mult)==0) return true;
    return false;    
    }
}