class Solution {
    public int strStr(String haystack, String needle) {
        int j=0;
        int k=0;
        int count=0;
        if(haystack.contains(needle)){
            for(int i=0;i<haystack.length();i++){
                j=i; 
                while(j<haystack.length()){
                    Character char1=haystack.charAt(j);
                    Character char2=needle.charAt(k);
                    if(char1.equals(char2)){
                        j++;
                        k++;
                        if(k==needle.length())
                            return i;
                    }
                    else{
                        k=0;
                        break;
                    }
                }
            }
        }
        else
            return -1;
        return 0;
    }
}
