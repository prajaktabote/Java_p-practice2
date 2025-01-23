class Student2{
    int rollno;
    String name;
    void insertRecord(int r,String n);
    {
        int rollno=r;
       String name=n;
    }
    void display(){

        System.out.println(rollno+ " "+name);
    }
}
class TestStudent2{
    public static void main(String args[]){
        Student2 s1 =new Student2();
        Student2 s2=new Student2();
        s1.insertRecord(111,"praju");
        s2.insertRecord(!12,"priya");
        s1.displayInformation();
        s2.displayInformation();
    }
}
