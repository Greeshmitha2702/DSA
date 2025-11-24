//to print reverse of a number
package DSA.Foundation;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=s.nextInt();
        int reversed=0;
        while(number!=0){
            int digit=number%10;
            reversed=reversed*10+digit;
            number/=10;
        }
        System.out.println("Reversed number: " + reversed);
        s.close();
    }
}
