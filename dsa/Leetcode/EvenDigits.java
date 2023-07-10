public class EvenDigits {
        static int findEvenDigit(int[] nums){
        int count_number = 0;
        
        for(int i=0; i<nums.length;i++){
            if(findNumberOfDigit(nums[i]) % 2 == 0){
                count_number++;
            }
        }
        return count_number;
    }

    static int findNumberOfDigit(int n){
        int count_digit = 0;
        while(n>0){
            n = n / 10;
            System.out.println("In while "+n);
            count_digit++;
            System.out.println("Value of Count Digit "+count_digit);
        }
        return count_digit;
    }
    public static void main(String[] args) {
        int[] nums = {1010, 56, 8};
    
        System.out.println("Even: "+findEvenDigit(nums));    }
   
}

