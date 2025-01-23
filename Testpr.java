//write a program to find the no. of and sum all integer greater than 100 less than 200 hat are divisible by 7
class Testpr{
    public static void main(String args[]){
        int i,sum;
        sum=0;
        for( i=101;i<200;i++){
            if(i%7==0){
                sum=sum+i;
            }
        }
        System.out.println("Sum is "+sum);
    }
}