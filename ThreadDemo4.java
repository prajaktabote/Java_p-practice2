class MyThread implements Runnable{
    public void run(){
        System.out.println("In run");
        System.out.println(Thread.CurrentThread().getName());
    }
}
class ThreadDemo4{
    public static void main(String args[]){
        MyThread obj=new MyThread();
        Thread t= new Thread(ibj);
        t.run();
        System.out.println(Thread.CurrentThread().getName());
    }
}