class Solution {
    public String removeDuplicates(String s) {
    if(s.length()==1)return s;
    Stack<Character>a=new Stack<Character>();
    a.push(s.charAt(0));
    for(int i=1;i<s.length();i++)
    {char c=s.charAt(i);
    if(a.size()==0||a.peek()!=c) a.push(c);
    else a.pop();
    }
    StringBuilder ans=new StringBuilder();
    for(char c:a)ans.append(c);
    return ans.toString();
    }
}