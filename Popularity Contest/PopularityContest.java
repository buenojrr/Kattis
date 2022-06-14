import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PopularityContest {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int successFactor = 0;
    int popularityFactor = 0;
    int marketabilityCoefficient = 0;
    int friends = scan.nextInt(), friendships = scan.nextInt();

    List<Integer> lista = new ArrayList<Integer>();
    for (int index = 0; index < friends; index++) {
      successFactor++;
      for (int i = 0; i < friendships; i++) {
        lista.add(scan.nextInt());
        lista.add(scan.nextInt());
      }
      friendships = 0;
      for (Integer test : lista) {
        if (test.equals(successFactor)) {
          popularityFactor++;
        }
      }
      marketabilityCoefficient = popularityFactor - successFactor;
      System.out.println(marketabilityCoefficient);
      popularityFactor = 0;
    }
  }
}