import java.util.HashSet;
import java.util.Scanner;

public class problemB {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    while (!s.equals("0")) {
      String l = sc.next();
      InnerproblemB p1 = new InnerproblemB();
      System.out.println(p1.occurrences(s, l) + " " + p1.type2(s, l) + " " + p1.type3(s, l));
      s = sc.next();
    }

  }

  public static class InnerproblemB {
    // Metodo usado para percorrer a string 2, é usado o tamando da string 1 como
    // referencia
    public int occurrences(String input1, String input2) {

      int total = 0;
      int tamanhoString1 = input1.length(); // Tamanho do input1
      int voltasNecessarias = input2.length() - tamanhoString1 + 1; // range do input2 somado a 1 para identificar a
      // segunda cadeia
      for (int i = 0; i < voltasNecessarias; i++) {
        // compara o input1 com a posição da string do input2
        // substring(a,b) a = posicao na array, b = posição geral do elemento
        if (input1.equals(input2.substring(i, i + tamanhoString1))) {
          total += 1;
        }
      }
      return total;
    }

    public int type2(String input1, String input2) {
      int type2Total = 0;
      HashSet<String> remove = new HashSet<>();
      InnerproblemB type2 = new InnerproblemB();
      // Remove letras do input2 e vai adicionando letras do input1.
      // e seguida adiciona os itens na hashtable
      // hashSet foi usado pois nao permite registros duplicados
      for (int i = 0; i < input1.length(); i++) {
        remove.add(input1.substring(0, i) + input1.substring((i + 1), input1.length()));
      }
      // Percorre cada item do HashTable e chama o metodo occurrences para ver quantas
      // vezes aquela string aparece no input2
      // e soma ao total
      for (String string : remove) {
        type2Total += type2.occurrences(string, input2);
      }
      return type2Total;
    }

    public int type3(String input1, String input2) {

      int type3Total = 0;
      InnerproblemB type3 = new InnerproblemB();
      HashSet<String> newLetter = new HashSet<>();
      // Percorre a string passando pelas letras fixas empurrando a parte 2 até passar
      // pela string inteira
      for (int i = 0; i < (input1.length() + 1); i++) {
        newLetter.add(input1.substring(0, i) + "A" + input1.substring(i, input1.length()));
        newLetter.add(input1.substring(0, i) + "G" + input1.substring(i, input1.length()));
        newLetter.add(input1.substring(0, i) + "C" + input1.substring(i, input1.length()));
        newLetter.add(input1.substring(0, i) + "T" + input1.substring(i, input1.length()));
      }
      // Percorre cada item do HashTable e chama o metodo occurrences para ver quantas
      // vezes aquela string aparece no input2
      // e soma ao total

      for (String string : newLetter) {
        type3Total += type3.occurrences(string, input2);
      }
      return type3Total;
    }
  }
}