/*
   *
*  *  *
   *
*/
package Patterns;
public class Q5 {
    public static void main(String[] args) {
        int n=5;
        int mid=n/2;
        for(int i=0;i<n;i++){
            int k=Math.abs(mid-i);
            int l=n-2*k;
            for(int j=0;j<k;j++){
                System.out.print(" ");
            }
            for(int j=0;j<l;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
