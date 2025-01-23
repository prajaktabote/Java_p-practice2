import java.util.*;
class Student236{
    String name;
    int rno,marks;
    Scanner sc=new Scanner(System.in);
    void getdata(){
        System.out.println("Enter name:"+name);
        name=sc.nextLine();
        System.out.println("Enter rono"+rno);
        rno=sc.nextInt();
        System.out.println("Enter marks"+marks);
        marks=sc.nextInt();
    }
    void display(){
        System.out.println("name is:"+name);
        System.out.println("rno is:"+rno);
        System.out.println("marks is:"+marks);
    }

}
class Student237{
    public static void main(String args[]){
        Student236 s = new Student236();
        s.getdata();
        s.display();
    }
}