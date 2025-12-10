//sliding window maximum: given an array and an integer k, find the maximum for each and every 
// contiguous subarray of size k.
package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Q6 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int[] arr=new int[n];
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int[] nge=new int[arr.length];
        nge[arr.length-1] = arr.length;
        stack.push(arr.length-1);
        for(int i = arr.length-2; i >= 0; i--){
            while(!stack.isEmpty() && arr[i] >= arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nge[i] = arr.length;
                //no greater element to the right(acts like infinity)
            }
            else{
                nge[i] = stack.peek();
            }
            stack.push(i);
            //indices are stored in the nge array
        }
        int k = sc.nextInt();
        int j = 0;
        for(int i = 0; i <= arr.length - k; i++){
            //to bring j inside the window(if j is lagging behind)
            if(j < i){
                j = i;
            }
            while(nge[j] < i+k){
                j = nge[j];
            }
            System.out.print(arr[j]+" ");
        }
        sc.close();
    }
}
