import java.util.Scanner;

public class TriangleArea {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    double base = in.nextInt();
    double height = in.nextInt();
    double area = (base * height) / 2;

    System.out.println(area);

  }
}