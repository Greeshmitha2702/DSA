//infix to prefix and postfix conversion
package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Q8 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String exp = sc.nextLine(); 
       Stack<String> pre = new Stack<>();
       Stack<String> post = new Stack<>();
       Stack<Character> optr = new Stack<>();
       for(int i = 0; i < exp.length(); i++){
        char ch = exp.charAt(i);
        if(ch == '('){
            optr.push(ch);
        }
        else if(ch == ')'){
            while(optr.peek() != '('){
                char op = optr.pop();

                String post2 = post.pop();
                String post1 = post.pop();
                String postval = post1 + post2 + op;
                post.push(postval);

                String pre2 = pre.pop();
                String pre1 = pre.pop();
                String preval = op + pre1 + pre2;
                pre.push(preval);
            }
            optr.pop();
        }
        else if(ch == '+' || ch == '-' || ch == '*' || ch =='/'){
            //here order of conditions is important
            //because if we put empty check at last then it will give error
            //coz if stack is empty and we do peek it will give error
            while(!optr.isEmpty() && optr.peek() != '(' && precedence(ch) <= precedence(optr.peek())){
                char op = optr.pop();
                
                String post2 = post.pop();
                String post1 = post.pop();
                String postval = post1 + post2 + op;
                post.push(postval);

                String pre2 = pre.pop();
                String pre1 = pre.pop();
                String preval = op + pre1 + pre2;
                pre.push(preval);
            }
            optr.push(ch);
        }
        else{
            pre.push(ch + "");
            post.push(ch + "");
        }
       }
       while(!optr.isEmpty()){
                char op = optr.pop();
                
                String post2 = post.pop();
                String post1 = post.pop();
                String postval = post1 + post2 + op;
                post.push(postval);

                String pre2 = pre.pop();
                String pre1 = pre.pop();
                String preval = op + pre1 + pre2;
                pre.push(preval);
            }
            System.out.println(pre.pop());
            System.out.println(post.pop());
       sc.close();
    }
    public static int precedence(char op){
        if(op == '+' || op == '-')
            return 1;
        else if(op == '*' || op == '/')
            return 2;
        else
            return 0;
    }
}
