import java.net.*;
class URLDemo{
    public static void main(String args[])throws MalformedURLException{
        URL obj=new URL("https://www/core2web.in");
        System.out.print(obj.getProtocol());
    System.out.print(obj.getPort());
    System.out.print(obj.getFile());
    }
}