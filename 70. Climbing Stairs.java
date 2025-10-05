class Solution {
    public int climbStairs(int n) {
        int sum = 0, prev = 0, next = 1;
        for(int i=0; i<n; i++){
            sum = prev + next;
            prev = next;
            next = sum;
        }
        return sum;
    }
}