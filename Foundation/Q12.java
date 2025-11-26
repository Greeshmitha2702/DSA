//Benjamin-bulb problem
//it states that if there are n bulbs and n voltages
//initially all bulbs are off
//on 1st pass all bulbs are toggled on
//on 2nd pass every 2nd bulb is toggled(2nd multiples)
//on 3rd pass every 3rd bulb is toggled(3rd multiples)
//this continues till nth pass
//solution: only perfect square numbered bulbs will remain on
//because they have odd number of factors, while non-perfect squares have even number of factors
package DSA.Foundation;
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        for(int i=1;i*i<=number;i++){
            System.out.print(i*i+" ");
        }
        s.close();
    }
}
