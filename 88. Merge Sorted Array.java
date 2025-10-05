class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m, small, temp;
        for(int num:nums2){
            nums1[i]=num;
            i++;
        }
        for(i=0; i<m+n-1; i++){
            small=i;
            for(int j=i+1; j<m+n; j++){
                if(nums1[small]>nums1[j]){
                    small = j;
                }
            }
            temp = nums1[small];
            nums1[small] = nums1[i];
            nums1[i] = temp;
        }
    }
}