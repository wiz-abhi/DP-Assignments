class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(n,k,ans,new ArrayList<>());
        return ans;
    }
void helper(int n,int k,List<List<Integer>> ans,List<Integer> list){
    if(list.size()==k){
        ans.add(new ArrayList<>(list));
        return;
    }
    if(n==0) return;
    list.add(n);
    helper(n-1,k,ans,list);
    list.remove(list.size()-1);
    helper(n-1,k,ans,list);
}
}
