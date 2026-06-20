class Solution {
    public int characterReplacement(String s, int k) {
         int[] count=new int[26];
         int left=0;
         int maxCount=0;
         int result=0;
         for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            count[c-'A']++;
            maxCount=Math.max(maxCount, count[c-'A']);
            while((right-left+1)-maxCount>k){
               // char leftChar=s.charAt(left);
                count[s.charAt(left)-'A']--;
                left++;
            }
            result=Math.max(result,right-left+1);
         } 
        return result;
    }
}
