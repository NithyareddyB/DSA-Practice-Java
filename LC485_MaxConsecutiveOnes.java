class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxlength = 0;
        int currentlength = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentlength++;
                if (currentlength > maxlength) {
                    maxlength = currentlength;
                }
            } else {
                currentlength = 0;
            }
        }

        return maxlength;
    }
}
