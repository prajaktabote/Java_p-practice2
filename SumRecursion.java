class SumRecursion{
    public static void Printsum(int i , int n, int sum){
          if(i==n){
            sum += i;
            System.out.println(sum);
            return; 
            }
         sum += i;
         Printsum(i+1 , n ,sum); 
    }
    public static void main(String args[]){
        Printsum(1, 5 , 0);
    }


}