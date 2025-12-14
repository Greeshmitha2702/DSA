//Merge overlapping Intervals
//start time and end time of intervals are given in 2-d array
//merge the overlapping intervals and print the result
package Stack;

import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter number of intervals");
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        System.out.println("Enter the intervals");
        for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Pair[] pairs = new Pair[n];
        for(int i=0;i<n;i++){
            pairs[i] = new Pair(arr[i][0], arr[i][1]);
        }

        //java sorts integer arrays but not objects directly
        //so we need to provide a comparator
        Arrays.sort(pairs);
        Stack<Pair> stack = new Stack<>();

        for(int i=0;i<n;i++){
            if(i == 0){
                stack.push(pairs[i]);
            }else{
                Pair top = stack.peek();
                if(pairs[i].st <= top.et){
                    //overlapping
                    top.et = Math.max(top.et, pairs[i].et);
                }else{
                    stack.push(pairs[i]);
                }
            }
        }
        Stack<Pair> reverseStack = new Stack<>();
        while(!stack.isEmpty()){
            reverseStack.push(stack.pop());
        }
        System.out.println("Merged intervals:");
        while(!reverseStack.isEmpty()){
            Pair p = reverseStack.pop();
            System.out.println(p.st + " " + p.et);
        }
        sc.close();
    }
}
class Pair implements Comparable<Pair> {
    int st;
    int et;

    Pair(int st, int et){
        this.st = st;
        this.et = et;
    }
    public int compareTo(Pair other){
        if(this.st != other.st){
            return this.st - other.st;
        }
        else{
            return this.et - other.et;
        }
    }
}
