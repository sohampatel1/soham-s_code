class Solution {
    public boolean wordPattern(String pattern, String s) {
    String a[]=new String[26];
    for(int i=0;i<26;i++) a[i]="";
    List<String>b=new ArrayList<>();
    StringBuilder c=new StringBuilder();
    for(int i=0;i<s.length();i++)
    {if(s.codePointAt(i)==32)
    {b.add(c.toString());
    c.setLength(0);
    }
    else
    {c.append(s.charAt(i));
    }
    }
    b.add(c.toString());
    if(pattern.length()!=b.size())return false;
    for(int i=0;i<pattern.length();i++)
    {if(a[pattern.codePointAt(i)-97].equals(""))
    {for(int j = 0; j < 26; j++) {
                    if(a[j].equals(b.get(i))) {
                        return false; }}
    a[pattern.codePointAt(i)-97]=b.get(i);
    }
    else
    {if(a[pattern.codePointAt(i)-97].equals(b.get(i))==false)
    {return false;}
    }
    }
    return true;  
    }
}