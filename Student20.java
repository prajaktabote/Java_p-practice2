class Student20 implements Cloneable{
    int rollno;
    String name;

    Student20(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    }
    public Object clone()throws CloneNotSupportedException{
       
        return super.clone();
    }
    public static void main(String args[]){
        try{
            Student20 s1= new  Student20(101,"amit");
            Student20 s2=(Student20)s1.clone();

            System.out.println(s1.rollno+ " "+s1.name);
            System.out.println(s2.rollno+ " "+s2.name);
        }catch(CloneNotSupportedException c){

        }
    }

}