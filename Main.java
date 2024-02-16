import java.util.Scanner;

public class Main {

  public static void comp(String str) {
    String dna = str.toUpperCase();
    if (!dna.matches("^[ACGT]+$")) {
      System.out.println("wrong command format");
      return;
    } else {
      byte[] arr = new byte[1 + (dna.length() / 4) + ((dna.length() % 4) == 0 ? 0 : 1)];
      arr[0] = (byte) dna.length();
      int count = 0;
      for (int i = 1; i < arr.length; i++) {
        byte sk = 0;
        for (int j = 0; j < 4; j++) {
          sk = (byte) (sk << 2);
          if (count < dna.length()) {
            if (dna.charAt(count) == 'A') {
              sk |= 0;
            } else if (dna.charAt(count) == 'C') {
              sk |= 1;
            } else if (dna.charAt(count) == 'G') {
              sk |= 2;
            } else {
              sk |= 3;
            }
            count++;
          } else {
            sk |= 0;
          }
        }
        arr[i] = sk;
      }

      for (byte el : arr) {
        System.out.print((String.format("%X", el)) + " ");
      }
      System.out.println();
    }
  }

  public static void decomp(byte[] sk) {
    for (byte el : sk) {
      System.out.print((String.format("%X", el)) + " ");
    }
    String result = "";
    System.out.println();
    for (int i = 1; i < sk.length; i++) {
      String mol = String.format("%8s", Integer.toBinaryString(sk[i] & 0xFF)).replace(" ", "0");
      result += mol;
    }
    for (int j = 0; j < sk[0] * 2; j += 2) {
      String dna = result.substring(j, j + 2);
      if (dna.equals("00")) {
        System.out.print("A");
      } else if (dna.equals("01")) {
        System.out.print("C");
      } else if (dna.equals("10")) {
        System.out.print("G");
      } else {
        System.out.print("T");
      }
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      String[] inf = sc.nextLine().split(" ");
      if (inf[0].equals("comp")) {
        comp(inf[1]);
      } else if (inf[0].equals("decomp")) {
        if (inf.length < 3 || (Integer.parseInt(inf[1]) != inf.length - 2)) {
          System.out.println("wrong command format");
          continue;
        }
        try {
          byte[] mas = new byte[Integer.parseInt(inf[1])];
          for (int i = 2; i < (mas.length + 2); i++) {
            mas[i - 2] = Byte.parseByte(inf[i]);
          }
          decomp(mas);
        } catch (Exception e) {
          System.out.println("wrong command format");
        }

      } else if (inf[0].equals("exit")) {
        break;
      } else {
        System.out.println("wrong command");
      }
    }
    sc.close();
  }
}