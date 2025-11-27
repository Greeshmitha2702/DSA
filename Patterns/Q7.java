//print diagonal pattern
package Patterns;

public class Q7 {
    public static void main(String[] args) {
        int n=5;
        int spb=0;
        int spa=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for(int j=0;j<n-1-i;j++){
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
