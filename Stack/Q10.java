//prefix evaluation and conversion to infix and postfix
package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter prefix expression");
        String exp = sc.nextLine();

        Stack<Integer> valueStack = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> postfix = new Stack<>();

        for(int i = exp.length() - 1; i >= 0; i--){
            char ch = exp.charAt(i);

            if(ch == '+' || ch == '-' || ch =='*' || ch == '/'){
                int value1 = valueStack.pop();
                int value2 = valueStack.pop();
                int value = operation(value1, value2, ch);
                valueStack.push(value);

                String iv1 = infix.pop();
                String iv2 = infix.pop();
                String iv = '(' + iv1 + ch + iv2 + ')';
                infix.push(iv);

                String pv1 = postfix.pop();
                String pv2 = postfix.pop();
                String pv = pv1 + pv2 + ch;
                postfix.push(pv);
            }else{
                valueStack.push(ch - '0');
                infix.push(ch+"");
                postfix.push(ch+"");
            }
        }
        System.out.println("value:"+valueStack.pop());
        System.out.println("Infix:"+infix.pop());
        System.out.println("postfix:"+postfix.pop());
        sc.close();
    }
    public static int operation(int v1, int v2, int operator){
    if(operator == '+')
        return v1+v2;
    else if(operator == '-')
        return v1-v2;
    else if(operator == '*')
        return v1*v2;
    else
        return v1/v2;
 }
}
