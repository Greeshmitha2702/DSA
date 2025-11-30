// Count the number of times a digit appears in a number
package Number_system;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        int check_digit=s.nextInt();
        System.out.println("number of times "+check_digit+" appeared = "+   count_digits(number, check_digit));
        s.close();
    }
    public static int count_digits(int number, int check_digit){
        int count=0;
        while(number!=0){
            int digit=number%10;
            if(digit==check_digit){
                count++;
            }
            number=number/10;
        }
        return count;
    }
}
