class Demo extends Thread{
    public void run(){
        System.out.println("Demo:"+Thread.CurrentThread().getName());
    }
}
class MyThread extends Thread{
    public void run(){
        System.out.println("MyThread:"+Thread.CurrentThread().getName());
        Demo obj2= new Demo();
        obj2.run();
    }
}
class ThreadDemo3{
    public static void main(String args[]){
        System.out.println("Thread:"+Thread.CurrentThread().getName());
        MyThread obj1=new MyThread();
         obj1.run();
    }
}