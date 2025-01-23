import java.util.Scanner;
class Transpose
{
    public static void main(String args[])
    {
        int m,n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns number of matrix");
        m=sc.nextInt();
        n=sc.nextInt();
         
         int matrix[][] = new int[m][n];
         System.out.println("enter the element of matrix");

         for(i=0;i<m;i++)
         for(j=0;j<n;j++)
         matrix[i][j]=sc.nextInt();

         int transpose[][] = new int[m][n];
    }
      System.out.println("Transpose of entered matrix");
    for(i=0 ; i<n ; i++)
    {
        for(j=0;j<m ; j++)
        System.out.println(transpose [m][n]+"\t");
        System.out.println("\n");
    }
}