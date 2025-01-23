class MyThread extends Thread{
    public void run(){
        Thread t=Thread.CurrentThread();
        System.out.println(t.getPriority());
    }
}
class ThreadDemo7{
    public static void main(String args[]){
        Thread t=Thread.CurrentThread();
        System.out.println(t.getPriority());
        MyThread obj2=new MyThread();
        obj2.run();
        t.setPriority(7);
        MyThread obj2=new MyThread();
        obj2.run();
    }
}