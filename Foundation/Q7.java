//To print inverse of a number
//number should be such that no digit occurs more than once and no missing digits
//to replace that digit at its place value
package DSA.Foundation;

public class Q7 {
    public static void main(String[] args) {
        int n=21453;
        //23154 is answer
        int answer=0;
        int count=0;
        while(n!=0){
            int digit=n%10;
            count++;
            answer+=count*(int)Math.pow(10,digit-1);
            n/=10;
        }
        System.out.println(answer);
    }
}
