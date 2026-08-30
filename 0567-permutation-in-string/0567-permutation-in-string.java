class Solution {
    public boolean checkInclusion(String s1, String s2) {
    int n1=s1.length(),n2=s2.length();
    if(n1>n2) return false;
    int[] a1=new int[26];
    for(char c:s1.toCharArray())
    {a1[c-'a']++;
    }
   int[]a2=new int[26];
   for(int i=0;i<n1;i++)
   {a2[s2.charAt(i)-'a']++;
   }
   if(Arrays.equals(a1,a2)) return true;
   for(int i=1;i<=n2-n1;i++)
   {a2[s2.charAt(i-1)-'a']--;
   a2[s2.charAt(i+n1-1)-'a']++;
   if(Arrays.equals(a1,a2)) return true;
   }
   return false;
    }
}