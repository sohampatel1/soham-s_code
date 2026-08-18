class Solution {
    public int lengthOfLongestSubstring(String s) {
    int max=0;
    int c=0;
    for(int i=0;i<s.length();i++)
    {HashSet<Integer>a=new HashSet<Integer>();
    for(int j=i;j<s.length();j++)
    {if(a.contains(s.codePointAt(j)))
    {break;}
    else
    {a.add(s.codePointAt(j));
     c++;
    }
    }
    if(max<=c) 
    {max=c;}
    c=0;
    }
    return max;   
    }
}