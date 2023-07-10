class Solve_MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; 
        int j = n - 1; 
        int k = (m + n - 1);
       
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {

                nums1[k--] = nums1[i--];

            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (i >= 0) {
            nums1[k--] = nums1[i--];

        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];

        }
        
        for(int l = 0; l < nums1.length; l++){
            System.out.print(nums1[l]+" ");
        }

    }

    public static void main(String[] args)
    {
        int[] nums1 = {1,2,9,12,15,0,0,0,0,0};
        int[] nums2 = {3,6,8,9,11};
        int m = 5;
        int n = 5;
        merge(nums1, m, nums2, n);

};

}