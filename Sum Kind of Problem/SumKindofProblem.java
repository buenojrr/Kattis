import java.util.Scanner;

public class SumKindofProblem {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int numberOfDataSets = scan.nextInt();

    for (int i = 0; i < numberOfDataSets; i++) {

      int dataSetNumber = scan.nextInt();
      int integerN = scan.nextInt();

      int sumNumber2 = integerN * integerN;
      int sumNumber3 = sumNumber2 + integerN;
      int sumNumber1 = sumNumber3 / 2;

      System.out.println(dataSetNumber + " " + sumNumber1 + " " + sumNumber2 + " " + sumNumber3);
    }

  }

}