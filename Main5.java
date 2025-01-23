//write a program to find the no. of and sum all integers
//greater than 100 less than 200 that are divisible by 7.
class Main5{
    public static void main(String args[]){
        int sum,i;
        sum=0;
        for(i=101;i<200;i++){
            if(i%7==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}