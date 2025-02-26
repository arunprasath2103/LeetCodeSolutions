//Remove Duplicates from Sorted Array
class Solution {
    public int removeDuplicates(int[] nums) {
        int x=0;
        int size=nums.length;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size+1;j++){
                if(j==size){
                    nums[x]=nums[i];
                    x+=1;
                    return x;
                }
                else if(nums[i]==nums[j]){
                    if(j+1==size){
                        nums[x]=nums[i];
                        x+=1;
                        return x;
                    }
                    else if(nums[i]!=nums[j+1]){
                        nums[x]=nums[i];
                        x+=1;
                        i=j;
                        break; 
                    }
                }
                else{
                    nums[x]=nums[i];
                    x+=1;
                    break;
                }
            }
        }
        return x;
    }
}
