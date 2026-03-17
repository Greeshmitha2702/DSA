package Patterns;

public class Q15 {
    public static void main(String[] args) {
        int n=5;
        int mid=n/2;
        int sp=2;
        int st=1;
        int val=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            int cval=val;
            for(int j=1;j<=st;j++){
                System.out.print(cval+"\t");
                if(j<=st/2)
                    cval++;
                else
                    cval--;
            }
            if(i<=mid){
                sp--;
                st+=2;
                val++;
            }
            else{
                sp++;
                st-=2;
                val--;
            }
            System.out.println();
        }
    }
}
