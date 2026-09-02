class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        fun(0,nums,new ArrayList<>(),ans);
        return ans;

        
    }
    public void fun(int index,int[]nums,List<Integer> curr,List<List<Integer>> ans){
        if(index==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        //pick
        curr.add(nums[index]);
        fun(index+1,nums,curr,ans);
        //backtrack
        curr.remove(curr.size()-1);
        //not pick
        fun(index+1,nums,curr,ans);
        
}
    }
    