//Arrays difference
package Arrays;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of first array(Bigger size) and its elements:");
        int n1=sc.nextInt();
        int[] a1=new int[n1];
        for(int i=0;i<n1;i++){
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter size of second array and its elements:");
        int n2=sc.nextInt();
        int[] a2=new int[n2];
        for(int i=0;i<n2;i++){
            a2[i]=sc.nextInt();
        }
        int c=0;
        int[] res=new int[n1];
        int i=n1-1;
        int j=n2-1;
        int k=res.length-1;
        while (k>=0) {
            int d=0;
            int a2v=j>=0?a2[j]:0;
            if(a1[i]+c>=a2v){
                d=a1[i]+c-a2v;
                c=0;
            }        
            else{
                d=a1[i]+c+10-a2v;
                c=-1;
            }
            res[k]=d;
            i--;
            j--;
            k--;
        }
        int l=0;
        while(l<res.length){
            if(res[l]==0)
                l++;
            else
                break;
        }
        while(l<res.length){
            System.out.println(res[l]);
            l++;
        }
        sc.close();
    }
}
