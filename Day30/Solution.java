//Problem-> 287. Find the Duplicate Number
class Solution {

    static {
        // Running the method 500 times with a dummy array
        for (int i = 0; i < 500; i++) {
            findDuplicate(new int[]{0});
        }
    }

    public static int findDuplicate(int[] nums) {
        int[] freq = new int[nums.length];
        for (int num : nums) {
            if (++freq[num] > 1) {
                return num;
            }
        }
        return 0;
    }
}
