class MyThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("In Thread-0");
        }
    }
}
class ThreadDemo78{
    public static void main(String args[]) throws InterrupteedException{
        MyThread obj=new MyThread();
        obj.start();
        obj.join();
        for(int i=0;i<5;i++){
            System.out.println("In main");
        }
    }
}