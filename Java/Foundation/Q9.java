//GCD and LCM of two numbers
package Foundation;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int orig_num1=number1;
        int orig_num2=number2;

        while(number1%number2!=0){
            int remainder=number1%number2;
            number1=number2;
            number2=remainder;
        }
        sc.close();
        int gcd=number2;
        int lcm=(orig_num1*orig_num2)/gcd;
        System.out.println("GCD: "+gcd);
        System.out.println("LCM: "+lcm);
    }
}
