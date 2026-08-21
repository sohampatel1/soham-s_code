class Solution {
    public String addSpaces(String s, int[] spaces) {
    int n=s.length(),m=spaces.length,si=0,ri=0,sp=0;
    char[] ans=new char[m+n];
    while(si<n)
    {if(sp<m && si==spaces[sp])
    {ans[ri++]=' ';
    sp++;
    }
    ans[ri++]=s.charAt(si++);
    }
    return new String(ans);     
    }
}