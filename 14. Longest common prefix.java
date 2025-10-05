class Solution {
    public String longestCommonPrefix(String[] strs) {
        int count=0;
        String prefix="";
        if(strs.length==1){
            return strs[0];
        }
        outerloop:
            for(int i=1;i<=strs[0].length();i++){
                for(String str:strs){
                    if(str.startsWith(strs[0].substring(0,i))){
                        prefix=strs[0].substring(0,i);
                    }
                    else{
                        prefix=strs[0].substring(0,i-1);
                        break outerloop;
                    }
                }
            }
        return prefix;
    }
}