import java.io.IOException;
import java.net.URL;
public class URLDEMO1{
    public static void main(String args[]){
        try{
            URL url= new URL("https://www.tutorialspoint.com/java/java_url_processing.htm");
            System.out.println("URL is" +url.toString());
            System.out.println("Protocol is" +url.getProtocol());
            System.out.println("authority is" +url.getAuthority());
            System.out.println("file name is"+url.getFile());
            System.out.println("host is" +url.grtHost());
            System.out.println("Path is" +url.getPath());
            System.out.println("port is"+url.getport());
            System.out.println("default port is"+url.getDefault());
            System.out.println("query is"+url.getQuery());
            System.out.println("ref is "+url.getref());
             }catch(IoException e){
                e.printStackTrace();
             }
    }
}