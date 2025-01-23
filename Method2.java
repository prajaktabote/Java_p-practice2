public class Method2
{

        public void add()
        {
            System.out.println("add");
        }
        public void sub()
        {
            Method2  m1= new Method2();
            m1.add();
            System.out.println("sub");
        }
     
        Public static void main(String args[])
        {
            Method2 m2= new Method2();
            m2.sub();
        }
}



