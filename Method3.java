//how to create method in java program
class Method3
{
    //constructor method
    Method3()
    {
        System.out.println("constructor method is called when an object of its class is created");

    }
    //main method where program execution begins
    public static void main(String args[])
    {
        staticMethod();
        Methods object=new Methods();
        object.nonStaticMethod();
    }
    //static method
    static void  staticMethod()
    {
        System.out.println("Static method can be called without creating object");

    }
    //non Static method
    void nonStaticMethod()
    {
        System.out.println("non static method can be called by creating an object");

    }
}