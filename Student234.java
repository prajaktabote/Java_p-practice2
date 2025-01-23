//create class Student having methods getmarks and display.The getMarks should accept
//rno,name,marks of student and display should print the same
import java.util.*;
class Student235{

    int rno,marks;
        String name;
    Scanner sc=new Scanner(System.in);
    void getdata(){
        System.out.println("Enter  rno");
        rno=sc.nextInt();
        System.out.println("Enter a marks");
        marks=sc.nextInt();
        System.out.println("Enter a name");
        name=sc.nextLine();
    }
    void disp(){
        System.out.println("rno is"+rno);
        System.out.println("Marks is"+marks);
        System.out.println("name is:"+name);
    }
}
class Student234{
    public static void main(String args[]){
        Student235 s=new Student235();
        s.getdata();
        s.disp();
    }
}