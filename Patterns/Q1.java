<<<<<<< HEAD
package Patterns;
public class Q1 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
=======
/*
*
* *
* * *
* * * *
* * * * *
*/  
package Patterns;

public class Q1 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
>>>>>>> 810ab8463341d96d3d25bd56691d8cd7098cebe4
