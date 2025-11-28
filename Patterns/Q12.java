package Patterns;

public class Q12 {
    public static void main(String[] args) {
        int n=6;
        int n1=0;
        int n2=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n1+"\t");
                int n3=n1+n2;
                n1=n2;
                n2=n3;
            }
            System.out.println();
        }
    }
}
