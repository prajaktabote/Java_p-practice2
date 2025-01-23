class MyThread extends ThreadDemo2{
    public void run(){
        System.out.println("In run");
        System.out.println(Thread.CurrentThread().getName());
    }
    public void start(){
        System.out.println("In MyThread start");
        run();
    }
}
class ThreadDemo2{
    public static void main(String args[]){
        MyThread obj=new MyThread();
        obj.run();
        System.out.println(Thread.CurrentThread().getName());
    }
}