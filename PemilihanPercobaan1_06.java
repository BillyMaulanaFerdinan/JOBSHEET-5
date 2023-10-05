import java.util.Scanner;

public class PemilihanPercobaan1_06 {
    public static void main(String[] args) {
    
    Scanner input06 = new Scanner(System.in);

    System.out.print("Masukkan angka:  ");
    int angka = input06.nextInt();
    String jenisbilangan = angka % 2 == 0 ? "bilangan genap" : "bilangan ganjil";
    System.out.println("bilangan " + angka + " adalah " + jenisbilangan);
}
}
