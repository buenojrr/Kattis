import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int successFactor = 0;
    int popularityFactor = 0;
    int marketabilityCoefficient = 0;
    int friends = scan.nextInt();
    int friendships = scan.nextInt();
    int[] lista;

    lista = new int[friendships];

    for (int index = 0; index < friends; index++) {
      successFactor++;
      for (int i = 0; i < friendships; i++) {
        lista[i] = scan.nextInt();
        lista[i] = scan.nextInt();
      }
      for (Integer test : lista) {
        if (test.equals(successFactor)) {
          popularityFactor++;
        }
      }
      friendships = 0;
      marketabilityCoefficient = popularityFactor - successFactor;
      System.out.println(marketabilityCoefficient);
      popularityFactor = 0;
    }
  }
}
