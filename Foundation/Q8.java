package DSA.Foundation;
public class Q8 {
    public static void main(String[] args) {
        int number=12345;
        int count=0;
        int temp=number;
        while(temp!=0){
            count++;
            temp/=10;
        }
        int rotation=3;
        int divisor=(int) Math.pow(10,rotation);
        int remainder=number%divisor;
        int rem_digits=number/divisor;
        int result=remainder*(int)Math.pow(10, count-rotation);
        int final_ans=result+rem_digits;
        System.out.println(final_ans);
    }
}
