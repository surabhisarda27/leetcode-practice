class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char i : s.toCharArray()){
            if(i == '(' || i == '{' || i == '[')
                st.push(i);
            else{
                if(!st.isEmpty()){
                char j = st.peek();
                if((i == ')' && j == '(') || (i ==']' && j == '[') ||(i == '}' && j == '{'))
                   st.pop();
                else
                    return false;
                }
                else return false;
            }
        }
        return st.isEmpty();
    }
}