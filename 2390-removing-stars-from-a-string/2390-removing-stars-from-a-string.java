class Solution {
    public String removeStars(String s) {
    Stack<Character>a=new Stack<>();
    for(int i=0;i<s.length();i++)
    {if(s.charAt(i)=='*')a.pop();
    else a.push(s.charAt(i));
    }
    StringBuilder ans=new StringBuilder();
    while(a.size()!=0)
    {ans.insert(0,a.pop());
    }
    return ans.toString();
    }
}