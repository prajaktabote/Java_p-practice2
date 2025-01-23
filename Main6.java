class Main6{
    public static void main(String args[]){
        int sum,i;
        sum=0;
        for(i=50;i<90;i++){
            if(i%7==0){
                sum=sum+i;
            }
        }
        System.out.println("sum is"+sum);
    }
}