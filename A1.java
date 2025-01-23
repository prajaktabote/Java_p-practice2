class A1
{
 int x;
 void add(int a)
 {
   x=a;
   print(x);
 }
 A1()
  {
    println("Hi");
  }
}
class B extends A1
 {
   int x;
   void add()
    {
      x=10;  
      println(x);
      Super.add(10);
    }
public static void main()
 {
  ob=new B();
  ob.add();
}
}
