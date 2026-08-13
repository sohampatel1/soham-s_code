class Solution {
    public int[] singleNumber(int[] nums) {
    List<Integer>a=new ArrayList();
    for(int i:nums)
    {if(a.contains(i)) a.remove((Integer)i);
    else a.add(i);
    }
    int[] n={a.get(0),a.get(1)};
    return n;   
    }
}