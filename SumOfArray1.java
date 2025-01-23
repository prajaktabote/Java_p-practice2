class sumOfArray1{
    public static void main(String args[]){
        int a[]={4,8,2,12,9};
        int sum=0;

        for(int value: a){
            sum=sum+value;
        }
        System.out.println("Sum of array Element is:" +sum);
    }
}