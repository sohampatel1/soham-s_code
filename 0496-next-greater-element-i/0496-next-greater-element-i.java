class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    List<Integer>a=new ArrayList();
    for(int i=0;i<nums2.length;i++)
    {a.add(nums2[i]);
    }
    for(int i=0;i<nums1.length;i++)
    {int in=a.indexOf(nums1[i]);
    if(in==a.size()-1) nums1[i]=-1;
    else
    {for(int j=in;j<a.size();j++)
    {if(nums1[i]<a.get(j)) 
    {nums1[i]=a.get(j);
    break;}
    }
    if(nums1[i]==a.get(in))nums1[i]=-1;
    }
    }
    return nums1;
    }
}