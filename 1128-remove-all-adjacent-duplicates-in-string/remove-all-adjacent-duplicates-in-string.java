class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char i : s.toCharArray()){
            if(!st.isEmpty()){
                char x = st.peek();
                if(x == i)
                    st.pop();
                else
                    st.push(i);
            }
            else
                st.push(i);
        }
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        return str.reverse().toString();
    }
}