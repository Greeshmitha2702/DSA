//convert any base number to any other base
package Number_system;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number, its base and target base:");
        int n=sc.nextInt();
        int b1=sc.nextInt();
        int b2=sc.nextInt();
        System.out.println(anybase_to_anybase(n, b1, b2));
        sc.close();
    }
    public static int anybase_to_decimal(int n, int base){
        int res=0;
        int power=1;
        while(n!=0){
            int digit = n%10;
            n/=10;
            res+=digit*power;
            power*=base;
        }
        return res;
    }
    public static int decimal_to_anybase(int n, int base){
        int res=0;
        int power=1;
        while(n!=0){
            int digit = n%base;
            n/=base;
            res+=digit*power;
            power*=10;
        }
        return res;
    }
    public static int anybase_to_anybase(int n,int b1, int b2){
        int res=0;
        int decimal=anybase_to_decimal(n, b1);
        res=decimal_to_anybase(decimal, b2);
        return res;
    }
}
