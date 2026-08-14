class Solution {
    public boolean canAliceWin(int n) {
        boolean p = false;
        for(int i = 10;i>0;i--){
            if(n >= i){
                p = !p;
                n -= i;
            }
            else 
                return p;
        }
        return p;
    }
}