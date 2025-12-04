//find span of an array
//span = max - min
package Arrays;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array and array elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxEle=arr[0];
        int minEle=arr[0];
        for(int i=01;i<arr.length;i++){
            if(arr[i]>maxEle){
                maxEle=arr[i];
            }
            if(arr[i]<minEle){
                minEle=arr[i];
            }
        }
        int span = maxEle - minEle;
        System.out.println("Span of the array is: " + span);
        sc.close();
    }
}
