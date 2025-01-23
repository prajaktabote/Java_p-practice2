
import java.util.Scanner;
class Substring
{
    public static void main(String args[])
    {
        String string,sub;
        int i,c,length;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string to print its all substring");
        string = sc.nextLine();
        length=string.length();
        System.out.println("substring of  \" "+string+ "\" are:-");
        for(c=0 ;c< length; c++)
        {
            for(i=1 ; i<=length; i++)
            {
                sub = string.substring(c,c+i);
                System.out.println(sub);
            }
        }
    }
}