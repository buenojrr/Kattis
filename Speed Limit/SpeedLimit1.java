import java.util.Scanner;

public class SpeedLimit1 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int records = scan.nextInt();

    while (records != -1) {
      int elapsedTime = 0;
      int distance = 0;

      for (int i = 0; i < records; i++) {

        int speed = scan.nextInt();
        int totalTime = scan.nextInt();

        distance += speed * (totalTime - elapsedTime);
        elapsedTime = totalTime;
      }
      System.out.println(distance + " miles");
      records = scan.nextInt();
    }
  }
}
