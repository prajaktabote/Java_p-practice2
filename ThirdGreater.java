public class ThirdGreater{
 
   public static int third(int a[], int total)
    { 
          int temp=0;
          for(int i=0;i<total;i++){
             for(int j=i+1;j<total;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

             }
          }
           return a[total-3];
    }
    
    
    public static void main(String args[]){
        int a[]=new int[]{1,2,3,4,5};
        System.out.print(" Third largest element is:" +third(a ,5));

    }

}