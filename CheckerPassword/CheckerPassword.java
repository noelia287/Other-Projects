package PROVA.CheckerPassword;

import java.util.Scanner;

public class CheckerPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🔐 Checker de contrasenyes");

        System.out.print("Escriu la contrasenya: ");
        String contrasenya = sc.nextLine();

        int forca = 0;

        if (contrasenya.length() >= 8) {
            forca++;
        }
        if (contrasenya.matches(".*[A-Z].*")) {
            forca++;
        }
        if (contrasenya.matches(".*[0-9].*")) {
            forca++;
        }
        if (contrasenya.matches(".*[!@#$%&*?].*")) {
            forca++;
        }

        if (forca <= 1) {
            System.out.println("💔 Contrasenya feble");
        } else if (forca == 2) {
            System.out.println("💛 Contrasenya mitjana");
        } else {
            System.out.println("💚 Contrasenya forta");
        }

        sc.close();
    }
}

