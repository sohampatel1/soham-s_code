class Solution {
    public boolean isPalindrome(String s) {
    StringBuilder b=new StringBuilder();
    StringBuilder c=new StringBuilder();
    char[] s1= s.toCharArray();
    for(int i=0;i<s1.length;i++)
    {int x=(int)s1[i];
    if(x>=65 && x<=90) 
    {b.append(Character.toLowerCase(s1[i]));
    c.insert(0,Character.toLowerCase(s1[i]));
    }
    else if(x>=97 && x<=122)
    {b.append(s1[i]);
    c.insert(0,s1[i]);
    }
    else if (x>=48 && x<=57)
    {b.append(x-48);
     c.insert(0,x-48);
    }
    }
    return (b.toString()).equals(c.toString());    
    }
}