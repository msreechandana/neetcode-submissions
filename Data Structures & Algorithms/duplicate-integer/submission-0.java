class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n =nums.length;
        boolean ans = false;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                //System.out.println( "i: "+i+"j: "+j);
                if(nums[i]==nums[j])
                {
                    ans=true;
                    break;
                }

            }
        }
        return ans;
    }
}