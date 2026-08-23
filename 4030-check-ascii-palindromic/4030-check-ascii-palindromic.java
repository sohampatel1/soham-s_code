class Solution {
    public boolean isPalindromic(String s) {
    int n=s.length();
    StringBuilder s1=new StringBuilder();
    for(int i=0;i<n;i++)
    {String s2=Integer.toString(s.codePointAt(i),2);
    while(s2.length()<8) s2='0'+s2;
    s1.append(s2);
    }
    n=s1.length();
    for(int i=0;i<n/2;i++)
    {if(s1.charAt(i)!=s1.charAt(n-1-i)) return false;
    }
    return true;
    }
}