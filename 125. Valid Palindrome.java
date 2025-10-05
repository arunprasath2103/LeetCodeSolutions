class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        s = s.toLowerCase();
        Character ch1, ch2;
        while(i < j) {
            ch1 = s.charAt(i);
            ch2 = s.charAt(j);
            if(((ch1 >= 48 && ch1 <= 57) || (ch1 >= 97 && ch1 <= 122)) && ((ch2 >= 48 && ch2 <= 57) || (ch2 >= 97 && ch2 <= 122))) {
                if(ch1 != ch2) {
                    return false;
                }
                i++;
                j--;
            }
            else if(!((ch1 >= 48 && ch1 <= 57) || (ch1 >= 97 && ch1 <= 122))) {
                i++;
            }
            else if(!((ch2 >= 48 && ch2 <= 57) || (ch2 >= 97 && ch2 <= 122))) {
                j--;
            }
        }
        return true;
    }
}