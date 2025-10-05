class Solution {
    public boolean isPalindrome(Integer x) {
        String digit1="";
        String digit2="";
        if(x>=0){
            while(x>0){
                digit1+=x%10;
                digit2=x%10+digit2;
                x/=10;
            }
        }
        else{
            return false;
        }
        if(digit1.equals(digit2)){
            return true;
        }
        else{
            return false;
        }
    }
}
