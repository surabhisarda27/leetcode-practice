class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n = 0;
        for(char i : stones.toCharArray()){
            if(jewels.contains(Character.toString(i)))
                n++;
        }
        return n;
    }
}