import java.util.Scanner;
class Whileloop1
{
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Input an integer");
            n = sc.nextInt();

            if(n==0)
            {
                break;

            }
            System.out.println("you entered " +n);
        }
    }

}