// Convert any base to decimal
package Number_system;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number and base:");
        int number=sc.nextInt();
        int base=sc.nextInt();
        System.out.println(base_to_decimal(number, base));
        sc.close();
    }
    public static int base_to_decimal(int n, int base){
        int res=0;
        int power=1;
        //extract each digit and multiply with base raised to its position
        while(n!=0){
            int rem=n%10;
            res+=rem*power;
            power=power*base;
            n/=10;
        }
        return res;
    }
}
