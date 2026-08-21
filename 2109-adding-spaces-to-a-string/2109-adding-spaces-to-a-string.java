class Solution {
    public String addSpaces(String s, int[] spaces) {
    char[] s1=s.toCharArray();
    StringBuilder ans=new StringBuilder();
    int sp=0,spl=spaces.length;
    for(int i=0;i<s.length();i++)
    {if(sp<spl && i==spaces[sp])
    {ans.append(" ");
    ans.append(s1[i]);
    sp++;
    }
    else ans.append(s1[i]);
    }
    s=ans.toString();
    return s;   
    }
}