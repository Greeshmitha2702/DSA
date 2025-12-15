//Smallest number that follow the pattern
//You are given a pattern consisting of the letters 'I' (for increasing) and 'D' (for decreasing).
//Write a program to find the smallest number that follows this pattern.
//eg: pattern = "DDIIDII" -> output = 32146578
package Stack;

import java.util.*;

public class Q13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pattern=sc.next();

        Stack<Integer> stack = new Stack<>();

        int counter = 1;

        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            if(c == 'd'){
                stack.push(counter);
                counter++;
            }else{
                stack.push(counter);
                counter++;
                while(!stack.isEmpty()){
                    System.out.print(stack.pop()+" ");
                }
            }
        }
        stack.push(counter);
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
        sc.close();
    }
}