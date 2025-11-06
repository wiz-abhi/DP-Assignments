//Delete Mid of a Stack

import java.util.Stack;

class Solution {
    public void deleteMid(Stack<Integer> s) {
        int len = s.size();
        deleteMid(s, len, 0);
    }

    void deleteMid(Stack<Integer> st, int size, int currSize) {
        // base case: reached middle from top
        if (currSize == size / 2) {
            st.pop();
            return;
        }

        int top = st.pop();
        deleteMid(st, size, currSize + 1);
        st.push(top); // backtrack
    }
}
