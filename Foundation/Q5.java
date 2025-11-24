//To print the digits of a number(from left to right)
package DSA.Foundation;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=s.nextInt();
        //it counts the number of digits in the number
        int temp=n;
        int count=0;
        while(temp!=0){
            count++;
            temp/=10;
        }
        //finds the divisor to extract the leading digit
        int div=(int)Math.pow(10,count-1);
        while(div!=0){
            int d=n/div;
            System.out.println(d);
            n=n%div;
            div=div/10;
        }
        s.close();
    }
}
