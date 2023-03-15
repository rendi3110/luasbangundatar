import java.util.Scanner;

public class Jajargenjang { 
  /**
 * @param args
 */
public static void main(String[] args) {
    try (var input = new Scanner(System.in)) {
        System.out.print("Masukkan alas jajar genjang: ");
        double alas = input.nextDouble();

        System.out.print("Masukkan tinggi jajar genjang: ");
        double tinggi = input.nextDouble();

        System.out.print("Masukkan sisi miring jajar genjang: ");
        double miring = input.nextDouble();

        double luas = alas * tinggi;
        double keliling = 2 * (alas + miring);

        System.out.println("Luas jajar genjang adalah: " + luas);
        System.out.println("Keliling jajar genjang adalah: " + keliling);
    }

  }
}