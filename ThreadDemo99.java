class ThreadDemo99{
    public static void main(String args[]){
        Thread t=Thread.currentThread();
        System.out.println(t.getName());
        MyThread obj=new MyThread();
        obj.start();
      //  obj.start();
    }
}