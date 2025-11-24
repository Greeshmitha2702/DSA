//To count number of digits in a number
package DSA.Foundation;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        System.out.println("Number of digits: " + count);
        s.close();
    }
}
