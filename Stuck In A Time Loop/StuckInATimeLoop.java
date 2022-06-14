import java.util.Scanner;

public class StuckInATimeLoop {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int number = scan.nextInt();
    int count = 0;

    for (int i = 0; i < number; i++) {
      count++;
      System.out.println(count + " Abracadabra");
    }

  }
}