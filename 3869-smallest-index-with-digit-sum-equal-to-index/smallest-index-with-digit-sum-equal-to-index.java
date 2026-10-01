class Solution {
    public int sum(int n){
        int s = 0;
        if(n <= 9)
            return n;
        while(n > 9){
            s += n%10;
            n/=10;
        }
        s += n;
        return s;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int s = sum(nums[i]);
            if(s == i)
                return i;
        }
        return -1;
    }
}