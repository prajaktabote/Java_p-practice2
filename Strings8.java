//input a string from the user. Create a new String called result in which will reolace you
//letter 'e' in the original String with letter 'i';

//Example :
//original = " eabcdef" ;result="iabcdif"
//"xyz"="xyz"; 
import java.util.*;
class Strings8{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        String result=" ";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                result +='i';
            }else{
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}