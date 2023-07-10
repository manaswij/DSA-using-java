public class Palindrome {
    // static void printArray(int[] array){
        
    //     for(int i = 0; i < array.length; i++){
    //         System.out.print(array[i] + " ");
    //     }
        
    //     System.out.println(" ");
    // }

    public static boolean isPalindrome(String word){
        char[] charArray = word.toCharArray(); //predefined function "toCharArray"
        int start = 0;
        int end = charArray.length-1;

        System.out.println("array: " + charArray.length );
        System.out.println("word: " + word.length());



        while(start<end){
            if (charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;   
        }
        return true;
    }

    public static void main(String[] args){
        String array = "madam";
        System.out.println("Answer: " + isPalindrome(array));
       
    };
}
