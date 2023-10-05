import java.util.Scanner;

public class TugasIndividu1_06 {

    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        System.out.println("Tutorial Battle Start");
        System.out.print("Masukkan Jarak musuh:");
        int jarak = input06.nextInt();

        String weapon = jarak <5 ? "melee weapon " : "range weapon ";
        System.out.println("jarak musuh " + jarak + " gunakan " + weapon);

    }
    
}
