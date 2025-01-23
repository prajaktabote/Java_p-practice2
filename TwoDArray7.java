//take a matrix as input from the user.search for a given number x and print indices at which it occurs
import java.util.*;
class TwoDArray7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int number[][]=new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                number[i][j]=sc.nextInt();
            }
            int x=sc.nextInt();
           
                for(int j=0;j<columns;j++){
                    if(number[i][j]==x){
                        System.out.println("found at location(" +i+ "," +j+ ")");
                    }
                }
            }
        }
    }
