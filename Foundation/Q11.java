//To check if given numbers are pythogorean triplet or not
package Foundation;
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  
        int b=s.nextInt();  
        int c=s.nextInt();
        int max=(a>b)?(a>c?a:c):(b>c?b:c);
        boolean res=false;
        if(max==a){
            res=(a*a)==(b*b+c*c);
        }
        else if(max==b){
            res=(b*b)==(a*a+c*c);
        }
        else{
            res=(c*c)==(a*a+b*b);
        }
        s.close();
        System.out.println(res);
    }
}
