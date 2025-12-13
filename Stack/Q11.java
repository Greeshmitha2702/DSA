//celebrity problem
//there is matrix n*n i is celebrity if all others know i and i knows no one
//1-known,0-unknown
package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of people");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            stack.push(i);
        }

        while(stack.size()>=2){
            int i = stack.pop();
            int j = stack.pop();
            if(arr[j][i] == 0){
                stack.push(j);
            }else{
                stack.push(i);
            }
        }
        int val = stack.pop();
        for(int i = 0; i < arr.length; i++){
            if(i != val){
                if(arr[i][val] == 0 || arr[val][i] == 1){
                    System.out.println("No celebrity");
                    return;
                }
            }
        }
        System.out.println("Celebrity:"+val);
    }
}
