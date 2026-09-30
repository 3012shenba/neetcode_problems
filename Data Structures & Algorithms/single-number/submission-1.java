class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer>list=new HashSet();
        int val=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    list.add(nums[i]);
                }
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!list.contains(nums[i]))
            {
                val=nums[i];
            }
        }
        return val;
    }
}
