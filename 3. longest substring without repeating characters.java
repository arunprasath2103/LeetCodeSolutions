class Solution {

    public int lengthOfLongestSubstring(String s) {
        HashMap<Integer, Character> letter = new HashMap<>();
        char[] arr = s.toCharArray();
        int len = 0, max = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < arr.length; j++){
                if(letter.containsValue(arr[j])) {
                    letter.clear();
                    break;
                }
                else {
                    len++;
                    letter.put(len, arr[j]);
                }
            }
            if (max < len) {
                max = len;
            }
            len = 0;
        }
        return max;
    }
}