class Solution {
    public String clearDigits(String s) {
    Stack<Character>a=new Stack<Character>();
    for(int i=0;i<s.length();i++)
    {int b=s.codePointAt(i);
    if(b>=48 && b<=57)
    {if(a.size()!=0) a.pop();
    }
    else a.push(s.charAt(i));
    }
    StringBuilder ans =new StringBuilder();
    for(char c:a) ans.append(c);
    return ans.toString();
    }
}