//Any base addition
package Number_system;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers and their base:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int base=sc.nextInt();
        int power=1;//to keep track of place value
        int carry=0;
        int res=0;
        while(n1!=0 || n2!=0 || carry!=0){
            int d1=n1%10;
            int d2=n2%10;
            int sum=d1+d2+carry;
            carry=sum/base;
            sum%=base;
            res+=sum*power;
            power*=10;
            n1/=10;
            n2/=10;
        }
        System.out.println(res);
        sc.close();
    }
}
