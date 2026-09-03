class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>(); 
        boolean[] used=new boolean[nums.length];
        fun(nums,new ArrayList<>(),used,res);
        return res;
        
    }
    public void fun(int[]nums,List<Integer> curr,boolean[] used,List<List<Integer>>res){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            used[i]=true;
            curr.add(nums[i]);
            fun(nums,curr,used,res);
            curr.remove(curr.size()-1);
            used[i]=false;
        }
    }
}