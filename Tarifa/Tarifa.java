import java.util.Scanner;

public class Tarifa {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int megaBytes = in.nextInt();
    int months = in.nextInt();
    int megaBytesRemaining = 0;

    for (int i = 0; i < months; i++) {
      int neverUsedMegaBytes = in.nextInt();
      megaBytesRemaining += megaBytes - neverUsedMegaBytes;
    }

    megaBytesRemaining += megaBytes;

    System.out.println(megaBytesRemaining);

  }

}