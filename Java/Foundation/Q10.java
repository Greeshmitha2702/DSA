//Prime factorization of a number
package Foundation;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        for(int div=2;div*div<=number;div++){
            while(number%div==0){
                System.out.print(div+" ");
                number/=div;
            }
            // optimization to break early
            if(number==1){
                break;
            }
        }
        if(number>1){
            System.out.print(number);
        }
        s.close();
    }
}
