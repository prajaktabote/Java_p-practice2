//Make a menu Driven program.The user can enter two number either 1 or 0.
//if the enter user 1 then keep taking input from the student marks (out of 100)
//if(enter 0 then stop)
//marks >=90 "This is good";
//89>=Marks>=60 "This is also good"
//59>=marks>=0 thhis is good as well
import java.util.*;
class Menu{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input;

        do{
            int marks= sc.nextInt();
            if(marks>=90 && marks <=100){
                System.out.println("This is good");
            }else if(marks>=60 && marks <=89){
                System.out.println("This is also good");
            }else if(marks >=0 && marks <=59){
                System.out.println("This is good as well");
            }else{
                System.out.println("Invalid");
            }
            System.out.println("want to continue ? (yes(1) or no(0))");
            input=sc.nextInt();
        }while(input == 1);

    }
}