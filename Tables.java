import java.util.Scanner;
class Tables{
    public static void main(String args[])
    {
        int a,b,c,d;
        System.out.println("Enter range of the number to print their multiplicatio table");
        Scanner sc= new Scanner(System.in);

        a=sc.nextInt();
        b=sc.nextInt();

        for(c=a; c<=b; c++)
        {
            System.out.println("multiplication table of c");

        }
        for(d=1; d<=10; d++)
        {
            System.out.println(c+ "*" +d+ "= "+(c*d));
        }
    }
}