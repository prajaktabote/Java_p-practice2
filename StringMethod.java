//find length,Concatenate and replace String in java program
class StringMethod
{
    public static void main(String args[])
    {
        int n;
        String s = "java programming",t="",u="";
        System.out.println(s);
        //find length of string
        n=s.length();
        System.out.println("Number of characters = " +n);

        //Replace character in string
        t = s.replace("Java" , "C++");
        System.out.println(s);
        System.out.println(t);

        //concatenating string with another string

        u= s.concat(" is fun");
        System.out.println(s);
        System.out.println(u);
        


    }
}