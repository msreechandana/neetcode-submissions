class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        //System.out.println(length);
        int[] ans = new int[2*n];
        for(int i=0;i<n;i++)
        {
            //System.out.print(i);
            //System.out.println(" "+(i+n));
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}