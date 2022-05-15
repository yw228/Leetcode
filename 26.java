class Solution26 {
    public int removeDuplicates(int[] nums) {
        int number = nums.length;
        int j = 0;
        for (int i = 0; i < number; i++)
        {
            if (nums[i] != nums[j])
            {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}