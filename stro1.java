class stro1{
    public static void main(String args[]){
        int n=145;
        int temp=n;
        int sum=0;
        while(n!=0){
            int rem= n%10;
            int mul=1;
            for(int i=rem; i>0;i--){
                mul=mul*i;
            }
            sum=sum+mul;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Strong number");
        }else{
            System.out.println(" not Strong number");
        }
    }
}