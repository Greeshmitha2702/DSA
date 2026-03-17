//To print prime numbers in the given range
package Foundation;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        Q2 obj = new Q2();
        obj.Sieve(n);
        s.close();
    }
    public void Sieve(int n){
        boolean[] isPrime=new boolean[n+1];
        for(int i=2;i<=n;i++)
            isPrime[i]=true;
        //edge case - return if n<2
        //if return is not used, loop condition is checked, atleat once
        if(n<2){
            System.out.println("There are no prime numbers in this range");
            return;
        }
        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                int p=i*i;
                while (p<=n){
                    isPrime[p]=false;
                    p+=i;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(isPrime[i])
                System.out.println(i);
        }
    }
}
