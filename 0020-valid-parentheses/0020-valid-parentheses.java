class Solution {
    public boolean isValid(String s) {
    Stack<Character>a=new Stack<>();
    char b;
    for(int i=0;i<s.length();i++)
    {b=s.charAt(i);
    if(b=='{'||b=='['||b=='<'||b=='(') a.push(b);
    else if(validpair(a,b)==false)return false;
    }
    return a.empty();   
    }
    public boolean validpair(Stack<Character>a,char b)
    {
    if(a.empty()==true) return false;
    char c=a.peek();
    if(c=='{'&&b=='}'){a.pop();return true;}
    else if(c=='('&&b==')'){a.pop();return true;}
    else if(c=='<'&&b=='>'){a.pop();return true;}
    else if(c=='['&&b==']'){a.pop();return true;}
    else return false;
    }
}