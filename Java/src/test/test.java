package test;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] occurence = { -1, -1 };
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                if (occurence[0] == -1) {
                    occurence[0] = i;
                    occurence[1] = i;
                } else {
                    occurence[1] = i;
                }
            }
        }
        return occurence;
    }
}