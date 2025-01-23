import java.util.*;
class Platform implements Comparable{
    String str=null;
    int fondYear=0;
    Platform(String str, int foundYear){
        this.str=str;
        this.foundYear=foundYear;
    }
    public String toString(){
        return "{"+str+":"+foundYear+"}";
    }
    public int CompareTo(Object obj){
        return this.foundYear-((Platform)obj).foundYear;

    }
    }
    class TreeDemoMap1{
        public static void main(String args[]){
            TreeMap tm= new TreeMap();
            tm.put(new Platform("youtube",2005),"Google");
                        tm.put(new Platform("Insta",2005),"Meta");
                                    tm.put(new Platform("facebook",2005),"Meta");
                                                tm.put(new Platform("ChatGpt",2005),"Google");
                                                System.out.println(tm);
        }
    }
