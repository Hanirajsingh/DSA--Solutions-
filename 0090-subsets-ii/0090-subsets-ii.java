class Solution {
    public void solve (int idx, int []nums, List<Integer> ans, List<List<Integer>>result){
        result.add(new ArrayList<>(ans));

        for (int i= idx; i<nums.length; i++){
            if (i!= idx && nums[i] == nums[i-1])continue;
            ans.add(nums[i]);
            solve(i+1,nums,ans,result);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        solve (0,nums,new ArrayList<>(), result);
        return result;
        
    }
}