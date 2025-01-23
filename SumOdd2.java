//write a function to print the sum of all od  number from1 to n.
import java.util.*;
class SumOdd2{
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner SC= new Scanner(System.in);
      
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2!=0){
               sum=sum+i;
            }
            System.out.println(sum);
        }
        
    }
}