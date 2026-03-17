//Addition of two arrays
package Arrays;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of first array and its elements:");
        int n1=sc.nextInt();
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter size of second array and its elements:");
        int n2=sc.nextInt();
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int c=0;
        int[] res=new int[n1>n2?n1:n2];
        int i=n1-1;
        int j=n2-1;
        int k=res.length-1;
        while(k>=0){
            int d=c;
            if(i>=0)
                d+=arr1[i];
            if(j>=0)
                d+=arr2[j];
            c=d/10;
            d=d%10;
            res[k]=d;
            i--;
            j--;
            k--;
        }
        if(c!=0){
            System.out.print(c);
        }
        for(int num:res){
            System.out.print(num);
        }
        sc.close();
    }
}
