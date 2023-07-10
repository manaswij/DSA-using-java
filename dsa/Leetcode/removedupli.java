public class removedupli {
    static int removeDuplicates(int[] nums) {

        // Keep count of numbers
        int count = 0;

        int length = nums.length;
        // Traverse
        for (int i = 0; i < length - 1; i++) {

            if (nums[i] != nums[i + 1]) { // Consecutive number agar same nai hai
                count++; // Count that number
            } else {
                nums[i] = nums[i + 1]; // Replace the number before with the one after it
            }
        }

        for(int i = 0 ; i < length;i++){
            System.out.println("Index "+ i+ " contains "+ nums[i]);
        }

        return count+1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2 };
        System.out.println(removeDuplicates(nums));
    }
}
