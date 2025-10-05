class Solution {
    public int mySqrt(int x) {

        if (x == 0 || x == 1) {
            return x;
        }
        
        int left = 0, right = x, result = 0, mid;

        while (left <= right) {
            mid = (int) (left + right)/2;
            if (mid == x / mid) {
                return mid;
            }
            else if (mid > x / mid) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return right;
    }
}