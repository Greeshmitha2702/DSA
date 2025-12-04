//Bar chart pattern
package Arrays;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of array and array elements:");
        int n=sc.nextInt();
        int[] arr=new int[n]; 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=max;i>=1;i--){
            //i>=1 because floor starts from 1
            //if we do i>=0 then it will print one extra star line
            for(int j=0;j<n;j++){
                if(arr[j]>=i){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
            sc.close();
    }
}
