//balanced parentheses using stack
package Stack;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Character> stack=new Stack<>();
        String string=sc.nextLine();
        sc.close();
        for(int i=0;i<string.length();i++){
            char c=string.charAt(i);
            //scenarios:
            //1.opening brackets
            //2.closing brackets- 2a. check if stack is empty- if yes then false
            //2b.matching brackets- pop
            //2c.non-matching brackets- false
            //5.finally if stack is empty- true else false
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }
            else if(c==']'||c=='}'||c==')'){ 
                if(stack.isEmpty()){
                    System.out.println(false);
                    return;
                }
                if((c==']'&&stack.peek()=='[')||(c=='}'&&stack.peek()=='{')||(c==')'&&stack.peek()=='('))
                {
                    stack.pop();
                }
                else{
                    System.out.println(false);
                    return;
                }
            }
        }
        if(stack.isEmpty())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
