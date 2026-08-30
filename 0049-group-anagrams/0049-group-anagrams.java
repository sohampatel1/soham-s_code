class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    if(strs==null||strs.length==0) return new ArrayList<>();
    HashMap<String,List<String>>a=new HashMap<>();
    for(String s:strs)   
    {int[] b=new int[26];
    for(char c:s.toCharArray())
    {b[c-'a']++;
    }
    StringBuilder ans=new StringBuilder();
    for(int i=0;i<26;i++) ans.append("-").append(b[i]);
    String key=ans.toString();
    if(a.containsKey(key)==false)
    {a.put(key,new ArrayList<>());
    }
    a.get(key).add(s);
    }
    return new ArrayList<>(a.values());
    }
}