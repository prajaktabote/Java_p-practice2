import java.util.Scanner;

class Swapnumber
{
    public static void main(String args[])
    {
        int x;
        int y;
        int temp;
        System.out.println("Enter x and y");
        Scanner sc = new Scanner(System.in);

        x= sc.nextInt();
        y=sc.nextInt();

        System.out.println("Before Swapping number\nx " +x+ "\n y=" +y);

        temp=x;
        x=y;
        y=temp;

        System.out.println("After the Swapping the number\nx"+x+"\ny=" +y);
    }
}