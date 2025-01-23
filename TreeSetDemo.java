import java.util.*;
class Movies implements comparable{
    String MovieName=null;
    float totcall=0.0f;
    Movies(String MovieName,float totcall){
        this.MovieName=MovieName;
        this.totcall=totcall;
    }
    public int compareTo(object obj){
        return(MovieName.compareTo((Movies.obj).MovieName));
    }
        public String toString(){
            return MovieName;
             }

}
class TreeSetDemo{
    public static void  main(String args[]){
        TreeSet ts=new TreeSet();
        ts.add(new Movies("Gader",150.0f));
        ts.add(new Movies("OMG2",120.0f));
        ts.add(new Movies("jailer",120.0f));
        System.out.println(ts);
    }
}