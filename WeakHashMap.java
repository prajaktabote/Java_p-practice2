class WeakHashMap{
    public static void main(String args[]){
        WeakHashMap obj1= new WeakHashMap("Cor2web");
        WeakHashMap obj2= new WeakHashMap("Biecaps");
        WeakHashMap obj3= new WeakHashMap("Incubator");

        WeakHashMap hm= new WeakHashMap();
        hm.put(obj1,2016);
        hm.put(obj2,2019);
        hm.put(obj3,2023);
        obj1=null;
        System.gc();
        System.out.println(hm);
    }
}