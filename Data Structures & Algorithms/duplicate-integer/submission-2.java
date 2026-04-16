class Solution {
    public boolean hasDuplicate(int[] nums) {
    HashMap<Integer,Boolean> set=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        if(set.containsKey(nums[i])){
            return true;
        }
        set.put(nums[i],true);
    }
    return false;
    }

}