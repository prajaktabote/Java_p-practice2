class Strong1{
    public static void main(String args[])
    {
        int n=145;
        int temp1=n;
        int sum=0;
        int mul=1;
        while(n!=0){
            int rem = n%10;
            for(int i=rem;i>0;i--){
                mul=mul*i;
            }
            sum=sum+mul;
            n=n/10;
        }
        if(temp1==sum){
            System.out.println("Strong numbrr");

        }else{
            System.out.println("not");
        }
    }
}