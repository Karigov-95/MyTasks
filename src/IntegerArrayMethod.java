public class IntegerArrayMethod {
    public static int[] TwoSum(int[] nums, int value){
        for (int i = 0; i < nums.length; i++) {

            int nums1 = nums[i];

            for (int j = i + 1; j < nums.length; j++) {

                if (value - nums1 == nums[j]){
                    return new int[]{i, j};
                }
            }

        }
        return null;
    }
}
