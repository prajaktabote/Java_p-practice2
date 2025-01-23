class Student209{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student209(String name,int age){
        this.name=name;
        this.age=age;
        
    }
    class Oops4{
        public static void main(String args[]){
            Student209 s1=new Student209("aman", 24);
            s1.printInfo();
        }
    }
}