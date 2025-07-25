class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n=nums.length;
        int max=Arrays.stream(nums).max().getAsInt();
        int min=Arrays.stream(nums).min().getAsInt();
        if (n<3){
            return -1;
        }
        for(int num: nums){
            if(num!=max && num!=min){
            return num;
        }
        }
        return -1;
    }
}
