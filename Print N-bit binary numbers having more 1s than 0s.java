//Print N-bit binary numbers having more 1s than 0s

class Solution {
    ArrayList<String> NBitBinary(int N) {
        ArrayList<String> ans = new ArrayList<>();
        findAns(N,ans,"",0,0);
        return ans;
    }
    void findAns(int n,List<String> ans, String res,int zeros,int ones){
        if(n==0){            //base case
            if(ones>=zeros)
            ans.add(res);
            return;
        }
        findAns(n-1,ans,res+'1',zeros,ones+1);      //left recursion
        if(ones>zeros)
        findAns(n-1,ans,res+'0',zeros+1,ones);      //right recursion
    }
}
