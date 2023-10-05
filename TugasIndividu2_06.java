import java.util.Scanner;

public class TugasIndividu2_06 {
    
    public static void main(String[] args) {

        Scanner input06 = new Scanner(System.in);
        boolean login = false;
        while (login == false){
            
            System.out.println("Masukkan Username");
            String username = input06.nextLine();
            System.out.println("Masukkan Password");
            String password = input06.nextLine();
            if (username.equals("Aing") && password.equals("Maung123")){
                System.out.println("Log in Berhasil");
                login = true;
            }
            else {
                System.out.println("User dan Password Salah");
            }
        }
    }
}
