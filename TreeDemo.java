class Myclass implements comparable{
    String str=null;
    Myclass(String str){
        this.str=str;
    }
    public int CompareTo(Myclass obj){
        
        return 1;

    }
}
class TreeDemo{
    public static void main(String args[]){
        Treeset ts= new Treeset();
        ts.add(new Myclass("Kahana"));
        ts.add(new Myclass("Ashish"));
        ts.add(new Myclass("Rahul"));
        ts.add(new Myclass("Badhe"));
        System.out.println(ts);
    }
}