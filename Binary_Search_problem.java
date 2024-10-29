question -> 1018. Binary Prefix Divisible By 5
Q.  You are given a binary array nums (0-indexed).
We define xi as the number whose binary representation is the subarray nums[0..i] (from most-significant-bit to least-significant-bit).
For example, if nums = [1,0,1], then x0 = 1, x1 = 2, and x2 = 5.
Return an array of booleans answer where answer[i] is true if xi is divisible by 5.

  class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean> res=new ArrayList<> ();
        int num=0;
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            num=(num*2+nums[i])%5;
            if(num%5==0){
                res.add(true);
            }else{
                 res.add(false);
            }
        }
        return res;
    }
}
