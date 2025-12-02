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
            d1+=carry;
            if(d1>=d2){
                diff=d1-d2;
                carry=0;
            }
            else{
                carry=-1;
                d1+=base;
                diff=d1-d2;
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
