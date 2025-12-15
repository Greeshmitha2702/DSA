//infix expression evaluation
package Stack;
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        Stack<Integer> opnd = new Stack<>();
        Stack<Character> optr = new Stack<>();
        for(int i = 0; i < exp.length(); i++){
            char val = exp.charAt(i);
            if(val == '(')
                optr.push(val);
            else if(val == ')'){
                while(optr.peek() != '('){
                    char op = optr.pop();
                    int op2 = opnd.pop();
                    int op1 = opnd.pop();
                    int res = operation(op1, op2, op);
                    opnd.push(res);
                }
                optr.pop();
            }
            else if(val == '+' || val == '-' || val == '*' || val == '/'){
                while(!optr.isEmpty() && precedence(val) <= precedence(optr.peek()) && optr.peek() != '('){
                    char op = optr.pop();
                    int op2 = opnd.pop();
                    int op1 = opnd.pop();
                    int res = operation(op1, op2, op);
                    opnd.push(res);
                }
                optr.push(val);
            }
            else{
                opnd.push(val - '0');
            }
        }
            while(!optr.isEmpty()){
                    char op = optr.peek();
                    int op2 = opnd.pop();
                    int op1 = opnd.pop();
                    int res = operation(op1, op2, op);
                    opnd.push(res);
                    optr.pop();
            }
        System.out.println(opnd.peek());
        sc.close();
    }
    public static int precedence(char optr){
        if(optr == '+' || optr == '-')
            return 1;
        else
            return 2;
        //Assumption is there are only +,-,*,/ operators
    }
    public static int operation(int op1, int op2, int optr){
        if(optr == '+')
            return op1 + op2;
        else if(optr == '-')
            return op1 - op2;
        else if(optr == '*')
            return op1 * op2;
        else
            return op1 / op2;
    }
}
