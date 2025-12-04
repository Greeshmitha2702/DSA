//find element in an array(return index)
package Arrays;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array and array elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to be searched:");
        int target=sc.nextInt();
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
        }
        System.out.println("Index of the element is: " + index);
        sc.close();
    }
}
