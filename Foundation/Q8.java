//rotation of a number
//positive rotation->clockwise
//negative rotation->anticlockwise
package DSA.Foundation;
public class Q8 {
    public static void main(String[] args) {
        int number=12345;
        int rotation=-2;
        int count=0;
        int temp=number;
        while(temp!=0){
            count++;
            temp/=10;
        }
        rotation=rotation%count;//for rotations greater than number of digits
        if(rotation<0){//for negative rotations
            rotation+=count;
        }
        int div=1;
        int mult=1;
        for(int i=1;i<=count;i++){
            if(i<=rotation){
                div*=10;
            }
            else{
                mult*=10;
            }
        }
        int quotient=number/div;
        int remainder=number%div;
        int result=(remainder*mult)+quotient;
        System.out.println(result);
    }
}
