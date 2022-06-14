import java.util.Scanner;

public class SpeedLimit {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int count = 0;
    String[] miles;

    miles = new String[10];

    while (num > -1) {
      int num2Ant = 0;
      int sum = 0;

      for (int i = 0; i < num; i++) {
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        sum += num1 * (num2 - num2Ant);
        num2Ant = num2;
      }

      miles[count] = Integer.toString(sum);
      count++;
      num = scan.nextInt();
    }
    count = 0;
    for (int i = 0; i < miles.length; i++) {

      if (miles[count] == null) {
        break;
      }
      System.out.println(miles[count] + " miles");
      count++;
    }

  }
}
