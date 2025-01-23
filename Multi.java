//how to create MultiThreading program in java
class Multi extends Thread{
    public void run()
    {
       for(int i=0;i<10;i++)
       {
        System.out.println("In run");
       }

    }
}
class ThraedDemo
{
    public static void main(String args[])
    {
        Multi obj = new Multi();
        obj.start();
        for(int i =0; i<10; i++)
        {
            System.out.println("In main");
        }
    }
}