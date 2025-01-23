class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread());
    }
}
class ThreadDemo10{
    public static void main(String args[])throws InterrupteedException{
System.out.println(Thread.currentThread());
MyThread obj=new MyThread();
obj.start();
Thread.currentThread.setName("core2web");
System.out.println(Thread.currentThread());
    }
}