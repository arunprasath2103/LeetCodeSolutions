class Solution {
    public int lengthOfLastWord(String s) {
        int len=0;
        if(s.equals("")){
            return 0;
        }
        else if(s.contains(" ")){
            for(int i=s.length()-1;i>=0;i--){
                if(s.charAt(i)!=' '){
                    len++;
                    if(i!=0&&s.charAt(i-1)==' '){
                        return len;
                    }
                }
            }
        }
        else
            return s.length();
        return len;
    }
}