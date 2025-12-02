//to convert decimal number to any base
package Number_system;
import java.util.Scanner;
public class Q2 {
 public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int base=s.nextInt();
    int res=0;
    int power=1;
    while(n!=0){
        int rem=n%base;
        res+=rem*power;
        power=power*10;
        n=n/base;
        //why multiply with 10?
        //eg:(634)10 = (1172)8
        //6*10^2 + 3*10^1 + 4*10^0 = 634
        //1172 = 1*8^3 + 1*8^2 + 7*8^1 + 2*8^0
        //so to place the digits at their respective places we multiply with 10
    }
    System.out.println(res);
    s.close();
 }   
}
