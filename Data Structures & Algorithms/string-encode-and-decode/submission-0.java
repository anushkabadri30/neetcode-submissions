class Solution {
    private static final String DELIMITER="#";
    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String str:strs){
            sb.append(str.length());
            sb.append(DELIMITER);
            sb.append(str);

        } 
        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> res= new ArrayList<>();
        int i=0;
        while(i<s.length()){
            int j=i;
            while(s.charAt(j)!='#'){
                j++;

            }
            int len=Integer.parseInt(s.substring(i,j));
                j++;

                String str=s.substring(j,j+len);
                res.add(str);
                i=j+len;
            

        }        
        return res;
        }
    }
