//To print Fibonacci series up to n terms
package DSA.Foundation;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int number = s.nextInt();
        int n1=0,n2=1;
        System.out.println("Fibonacci Series up to "+number+" terms:");
        for(int i=0;i<number;i++){
            System.out.println(n1);
            int n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        s.close();
    }
}
