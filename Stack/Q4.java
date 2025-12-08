//stock span problem: in a stock market, for a given array of n daily price values of a stock, the span Si of
//the stock’s price on a given day i is defined as the maximum number of consecutive days just before the 
// given day, for which the price of the stock on the current day is less than or equal to its price on the 
// given day.
package Stack;

import java.util.Scanner;
import java.util.Stack;

class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] sol=new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        sol[0]=1;
        for(int i=1;i<arr.length;i++){
            while(!stack.isEmpty() && arr[i]>arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                sol[i]=i+1;
            }
            else{
                sol[i]=i-stack.peek();
            }
            stack.push(i);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(sol[i]+" ");
        }
        sc.close();
    }
}