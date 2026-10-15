class Solution {
  private void backtrack(List<List<Integer>> resultset, List<Integer> tempset, int [] nums, int start){

    resultset.add(new ArrayList<>(tempset));

    for (int i = start; i<nums.length; i++){

    tempset.add(nums[i]);

    backtrack(resultset,tempset, nums, i+1);

    tempset.remove(tempset.size() -1);
  }
  }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack (resultList, new ArrayList<>() , nums ,0);
        return resultList;
        
    }
}