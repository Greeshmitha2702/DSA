//to check if the expression has duplicate parenthesis or not
package Stack;

import java.util.*;

public class Q1 {
   public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String string=s.nextLine();
        s.close();
        Stack<Character> stack=new Stack<>();
        int i=0;
        while(i<string.length()){ 
            char c=string.charAt(i);
            if(c==')'){
                if(stack.peek()=='('){
                    System.out.println(true);
                    return;
                }
                else{
                    while(stack.peek()!='('){
                        stack.pop();
                    }
                    stack.pop();//to pop the opening bracket
                }
            }
            else
                stack.push(c);
            i++;
        }
        System.out.println(false);
   }
}
