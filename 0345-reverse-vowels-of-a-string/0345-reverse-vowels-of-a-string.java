class Solution {
    public String reverseVowels(String s) {
    Stack<Character>a=new Stack<Character>();
    for(int i=0;i<s.length();i++)
    {char c=s.charAt(i);
    if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U') a.push(c); 
    }
    char[] ans=s.toCharArray();
    for(int i=0;i<ans.length;i++)
    {char c=ans[i];
    if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
    {ans[i]=a.pop();
    }
    }
    return new String(ans);
    }
}