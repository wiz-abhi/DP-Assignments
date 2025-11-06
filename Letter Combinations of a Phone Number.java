class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        List<String> ans = new ArrayList<>();
        findAns(digits,ans,"",0,map);
        return ans;
    }
    void findAns(String digits,List<String> ans, String newStr,int idx,Map<Character,String> map){
        if(idx == digits.length()) {
            ans.add(newStr);
            return;

        }

        for(char c : map.get(digits.charAt(idx)).toCharArray()){
            findAns(digits,ans,newStr+c,idx+1,map); 
        }
    }
}
