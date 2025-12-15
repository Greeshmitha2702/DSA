package Stack;
import java.util.*;
public class Q3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] sol=new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        //left to right approach
        stack.push(0);
        for(int i=1; i<arr.length;i++){
            while(!stack.isEmpty() && arr[i]>arr[stack.peek()]){
                int pos=stack.peek();
                sol[pos]=arr[i];
                stack.pop();
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int pos=stack.peek();
            sol[pos]=-1;
            stack.pop();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(sol[i]+" ");
        }
        sc.close();
    }
}
