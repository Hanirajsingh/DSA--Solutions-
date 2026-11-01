class Solution {
    public void solve (int idx, int arr[], int target, List<List<Integer>>result, List<Integer>ans){
        if (target == 0){
            result.add(new ArrayList<>(ans));
            return;
        }

        for (int i = idx; i<arr.length; i++){
            if (i>idx && arr[i] == arr[i-1])continue;

            if (arr[i]>target)break;

        ans.add(arr[i]);
        solve (i+1,arr,target-arr[i],result,ans);
        ans.remove(ans.size()-1);
    }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        solve(0, candidates, target, ans, new ArrayList<>());

        return ans;
    }
}