import java.util.*;
public class InfixToPostfix{
    public static int precedence(char c){
        switch (c){
            case '+': case '-':
                return 1;
            case '*': case '/':
                return 2;
        }
        return 0;
    }
    public static String infixToPostfix(String infix){
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char c : infix.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                result.append(c);
            }
            else if(c == '('){
                stack.push(c);
            }
            else if(c == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    result.append(stack.pop());
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek())){
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.toString();
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Expression: ");
        String infix = obj.nextLine();
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix Expression of " + infix + " is : " + postfix);
        obj.close();
    }
}