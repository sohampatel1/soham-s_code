class Solution {
    public String addSpaces(String s, int[] spaces) {
    HashSet<Integer>a=new HashSet<>();
    char[] s1=s.toCharArray();
    for(int i:spaces)a.add(i);
    StringBuilder ans=new StringBuilder();
    for(int i=0;i<s.length();i++)
    {if(a.contains(i))
    {ans.append(" ");
    ans.append(s1[i]);
    }
    else ans.append(s1[i]);
    }
    s=ans.toString();
    return s;   
    }
}