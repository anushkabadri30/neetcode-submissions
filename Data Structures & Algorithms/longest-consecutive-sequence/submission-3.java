class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
        set.add(n);
        }
        int longest=0;
        for(int n:set){
            int currnum=n;
            int count=1;
        if(!set.contains(n-1)){
        while(set.contains(currnum+1)){
            currnum++;
            count++;
        }
            longest=Math.max(longest,count);

        }
        }
        return longest;
    }
}
