class Student19 implements Cloneable{
    int rollno;
    String name;

    Student19(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    public Object clone() throws CloneNotSupportedException{
    return super.clone();
    }
    public static void main(String args[]){
        try{
            Student19 s1=Student19(101,"amit");

            student19 s2=(Student19)s1.clone();
            System.out.println(s1.rollno+ " "+s1.name);
            System.out.println(s2.rollno+ " "+s2.name);
        }catch(ClonaNotSupportedException c){
            
        }
    }

}

