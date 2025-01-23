import java.io.*;
import java.net.*;
class URLConnection{
    public static void main(String args[])throws IoException,MalformedURLException{
        URL obj=new URL("https://www.youtube.com");
        URLConnection conn=obj.OpenConnection();
        System.out.print("LastModified:" +new Date(conn.getLastModified()));
    }
}