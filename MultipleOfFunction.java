import java.util.*;
class MultipleOfFunction{
    public static int Product(int a, int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();

        System.out.println("Product of 2 numbers is:" +Product(a,b));
    }
}