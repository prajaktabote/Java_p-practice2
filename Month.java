//Ask the user to enter the number of the month and print the of the month.For eg
//1. print'jaunary' 2.print 'feb' and so on
import java.util.*;
class Month{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a month");
        int Month=sc.nextInt();

        switch(Month){
            case 1 : System.out.println("jaunary");
            break;
            case 2 :System.out.println("Feb");
            break;
            case 3 :System.out.println("March");
            break;
            case 4 : System.out.println("April");
            break;
            case 5 :System.out.println("May");
            break;
            case 6 : System.out.println("June");
            break;
            case 7 : System.out.println("july");
            break;
            case 8 : System.out.println("August");
            break;
            case 9: System.out.println("sep");
            break;
             
            case 10: System.out.println("oct");
            break;
            case 11: System.out.println("Nov");
            break;
            default :System.out.println("Dec");



        }
    }
}