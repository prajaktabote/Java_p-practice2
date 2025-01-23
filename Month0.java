import java.util.*;
class Month0{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a month");
        int Month0= sc.nextInt();
        switch(Month0){
            case 1: System.out.println("Jaunary");
            break;
            case 2:
                System.out.println("Feb");
                break;
                case 3:
                    System.out.println("March");
                    break;
                    case 4:
                    System.out.println("April");
                    break;
                    case 5: System.out.println("May");
                    break;
                    case 6:
                         System.out.println("June");
                         break;
                         case 7:
                            System.out.println("July");
                            break;
                            case 8: System.out.println("August");
                            break;
                            case 9: System.out.println("sep");
                            break;
                            case 10:
                                System.out.println("oct");
                                break;
                                case 11: System.out.println("NoV");
                                break;
                                default :
                                System.out.println("Dec");



        }
    }
}