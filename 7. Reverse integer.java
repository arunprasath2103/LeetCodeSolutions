class Solution {
    public int reverse(int x) {
        int pop;
        int reverse = 0;
		while(x != 0) {
            pop = x % 10;
			x /= 10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && x > 7)) {
                return 0;
            }
            if (reverse < Integer.MIN_VALUE / 10 || reverse == Integer.MIN_VALUE / 10 && x < -8) {
                return 0;
            }
			reverse = (reverse * 10) + pop;
		}
        return reverse;
    }
}