class ThreadDemo8{
    public static void main(String args[]){
        Thread t=Thread.CurrentThread();
        System.out.println(t.getName());
        MyThread obj=new MyThread();
        obj.start();
        obj.start();
    }
}