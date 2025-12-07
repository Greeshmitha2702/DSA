//next greater element
package Stack;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] sol=new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        sol[arr.length-1]=-1;
        stack.push(arr[arr.length-1]);
        for(int i=arr.length-2; i>=0; i--){
            while(!stack.isEmpty() && stack.peek()<arr[i]){
                stack.pop();
            }
            if(stack.isEmpty())
                sol[i]=-1;
            else
                sol[i]=stack.peek();
            stack.push(arr[i]);
        }
        for(int i=0;i<sol.length;i++){
            System.out.print(sol[i]+" ");
        }
        sc.close();
    }
}
