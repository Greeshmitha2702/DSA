//Any base subtraction
package Number_system;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers(first number is greater) and their base:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int base=sc.nextInt();
        int power=1;
        int res=0;
        int carry=0;
        while(n1!=0 || carry!=0){
            int d1=n1%10;
            int d2=n2%10;
            int diff=0;
            if(d1 + carry>=d2){
                diff=d1+carry-d2;
                carry=0;
            }
            else{
                diff=d1+carry+base-d2;
                carry=-1;
            }
            res+=diff*power;
            power*=10;
            n1/=10;
            n2/=10;
        }
        System.out.println(res);
        sc.close();
    }
}
