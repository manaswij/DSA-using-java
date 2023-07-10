import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        System.out.print("String is ");
        printArray(s.toCharArray());
        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char top = stack.peek();
                    if((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void printArray(char[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] +"");
        }
        System.out.println("");
    }

    public static void main(String[] args)
    {
        String s = "{([])}";
        System.out.println("String Valid: " + isValid(s));
    };


}
