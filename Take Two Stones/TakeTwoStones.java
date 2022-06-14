import java.util.Scanner;

public class TakeTwoStones {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double number = sc.nextInt();
    number = number % 2;

    if (number > 0) {
      System.out.println("Alice");
    } else {
      System.out.println("Bob");
    }
  }
}