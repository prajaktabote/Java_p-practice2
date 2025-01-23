import java.util.Scanner;

public class Main89 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int l = scanner.nextInt();
int m = scanner.nextInt();

int y = (m - 2 * l) / 2; // total number of animals with four legs

int x = l - y; // total number of animals with two legs

System.out.println(x + " " + y);

scanner.close();
}
}
