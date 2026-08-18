class Solution {
    public List<Integer> findDuplicates(int[] nums) {
   Set<Integer>a=new HashSet<Integer>();
    List<Integer>b=new ArrayList<Integer>();
    for(int i=0;i<nums.length;i++)
    {if(a.contains(nums[i])&&(b.contains(nums[i])==false))
    {b.add(nums[i]);}
    else
    {a.add(nums[i]);}
    }
    return b;
    }
}