import java.util.Scanner;
class Whileloop{
    public static void main(String args[])
    {
        int n;
        System.out.println("enter an integer");
        Scanner sc= new Scanner(System.in);

        while((n=sc.nextInt ())!=0)
        {
            System.out.println("you entered" +n);
            System.out.println("Input an integer");

        }
        System.out.println("out of loop");
    }
}