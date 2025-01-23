public class Method
{
    public  void add()
    {
        int a=10;
        int b=20;
        System.out.println(a+b);

    }
    public void mult()
    {
        int a=9;
        int b=9;
        System.out.println(a*b);
    }
    
        public static void main(String args[])
        {
            Method m1 = new Method();  ///first main method use
                                       ///all data come in create object

            m1.add();
            m1.mult();
        }
    
}