//Largest area in Histogram
//Given n non-negative integers representing the histogram's bar height where the width of each bar is 1,
//find the area of largest rectangle in the histogram.
package Stack;

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Stack<Integer> stack=new Stack<>();
        int[] rb=new int[arr.length];
        rb[arr.length-1]=arr.length;
        stack.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--){
            while(!stack.isEmpty() && arr[i]<=arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty())
                rb[i] = arr.length;
            //no smaller element present in it's right
            else
                rb[i]=stack.peek();
            stack.push(i);
        }
        stack = new Stack<>();
        int[] lb=new int[arr.length];
        lb[0] = -1;
        stack.push(0);
        for(int i = 1; i < arr.length; i++){
            while(!stack.isEmpty() && arr[i] <= arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                lb[i] = -1;
            }
            else{
                lb[i] = stack.peek();
            }
            stack.push(i);
        }
        int maxArea=0;
        for(int i = 0; i < arr.length; i++){
            int width = rb[i] - lb[i] -1;
            int height = arr[i];
            int area = width * height;
            if(area > maxArea){
                maxArea = area;
            }
        }
        System.out.println("Maximum histogram area: "+maxArea);
        sc.close();
    }
}
