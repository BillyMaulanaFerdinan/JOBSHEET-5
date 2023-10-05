import java.util.Scanner;

public class PemilihanPercobaan2_06 {

    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        System.out.print("Nilai UAS      : ");
        float UAS = input06.nextFloat();
        System.out.print("Nilai UTS      : ");
        float UTS = input06.nextFloat();
        System.out.print("Nilai Kuis     : ");
        float Kuis =  input06.nextFloat();
        System.out.print("Nilai Tugas    : ");
        float Tugas = input06.nextFloat();
        float total = ( UAS * 0.4F) + (UTS * 0.3F) + (Kuis * 0.1F) + (Tugas * 0.2F);
        String message = total < 65 ? "REMIDI" : "TIDAK REMIDI";
        System.out.println("Nilai Akhir = " + total + " sehingga " + message);
        if (total > 81){
            System.out.println("Nilai Anda A ");
            System.out.println("Nilai setara 4 ");
            System.out.println("Sangat Baik ");
        }
        else if (total > 73){
            System.out.println("Nilai Anda B+ ");
            System.out.println("Nilai setara 3.5 ");
            System.out.println("Lebih Dari Baik ");
        }
        else if (total > 65){
            System.out.println("Nilai Anda B ");
            System.out.println("Nilai setara 3 ");
            System.out.println("Baik");
        }
        else if (total > 60){
            System.out.println("Nilai Anda C+, ");
            System.out.println("Nilai Setara 2.5 ");
            System.out.println("Lebih Dari Cukup");
        }
        else if (total > 50){
            System.out.println("Nilai Anda C ");
            System.out.println("Nilai Setara 2 ");
            System.out.println("Cukup");
        }
        else if (total > 39){
            System.out.println("Nilai Anda D ");
            System.out.println("Nilai setara 1 ");
            System.out.println("Kurang");
        }
        else {
            System.out.println("Nilai Anda E ");
            System.out.println(" Nilai setara 0 ");
            System.out.println("Gagal");
        }
     
            
        
    }
}
