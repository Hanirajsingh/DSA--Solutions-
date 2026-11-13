class Solution {
    public void helper (int start,int remain_k, int remain_n, List<Integer>copy, List<List<Integer>>result ){
        if (remain_k == 0 && remain_n == 0){
            result.add(new ArrayList<> (copy));
            return;
        }
        if (remain_k == 0 || remain_n<0){
             return;
        }
        for (int i = start; i<=9; i++){
            copy.add(i);
            
            helper(i+1, remain_k-1, remain_n-i,copy,result);
            copy.remove(copy.size()-1);
            
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        helper(1,k,n,new ArrayList<>(),result);
        return result;
        
    }
}