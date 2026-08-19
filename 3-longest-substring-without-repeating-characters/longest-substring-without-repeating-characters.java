class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        int ws = 0, we = 0;
        for(;we<s.length(); we++){
            char ad = s.charAt(we);
            map.put(ad, map.getOrDefault(ad , 0) + 1);
            if(map.get(ad) > 1){
                while(ws <= we){
                    char re = s.charAt(ws);
                    map.put(re, map.get(re) - 1);
                    ws++;
                    if(map.get(ad) == 1) break;
                }
            }
            ans = Math.max(ans, we - ws + 1);
        }
        return ans;
    }
}