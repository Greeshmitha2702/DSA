//to find out a sequrnce of n numbers as prime or not
package Foundation;
import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int t=s.nextInt();
            int count=0;
            for(int j=2;j*j<=t;j++){
                if(t%j==0){
                     count++;
                     break;
                }
            }
            if(count==0)
                System.out.println(t+" is a prime number");
            else
                System.out.println(t+" is not a prime number");
        }
        s.close();
    }
}