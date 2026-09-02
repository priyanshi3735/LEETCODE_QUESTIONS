class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        fun(0,nums,new ArrayList<>(),ans);

        return new ArrayList<>(ans);
        
    }
    public void fun(int index,int[] nums,List<Integer> curr,Set<List<Integer>> ans){
        if(index==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        fun(index+1,nums,curr,ans);
        curr.remove(curr.size()-1);
        fun(index+1,nums,curr,ans);
    }
}