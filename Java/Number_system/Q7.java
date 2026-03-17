//any base multiplication
package Number_system;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers and their base:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int base=sc.nextInt();
        int result=getMultiplication(n1,n2,base);
        System.out.println(result);
        sc.close();
    }
    public static int getMultiplication(int n1,int n2,int base){
        int power=1;
        int res=0;
        while(n2!=0){
            int d2=n2%10;
            n2/=10;
            int singleDigitProduct=getSingleDigitMultiplication(n1,d2,base);
            res=getAddition(singleDigitProduct*power, res, base);
            power*=10;
        }
        return res;
    }
    public static int getSingleDigitMultiplication(int n1,int d2,int base){
        int res=0;
        int power=1;
        int c=0;
        while(n1!=0||c!=0){
            int d1=n1%10;
            n1/=10;
            int prod=d1*d2+c;
            c=prod/base;
            prod%=base;
            res+=prod*power;
            power*=10;
        }
        return res;
    }
    public static int getAddition(int n1,int n2,int base){
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
        return res;
    }
}
