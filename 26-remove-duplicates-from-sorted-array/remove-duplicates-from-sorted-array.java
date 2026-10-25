class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j : nums){
            if(nums[i] != j){
                i++;
                nums[i] = j;
            }
        }
        return  i+1;
    }
}