import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MiniDiari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcio = "";

        System.out.println("📓 Mini Diari");

        while (!opcio.equals("3")) {
            System.out.println("\n1. Afegir nota");
            System.out.println("2. Veure notes");
            System.out.println("3. Sortir");
            System.out.print("Tria una opció: ");
            opcio = sc.nextLine();

            if (opcio.equals("1")) {
                System.out.print("Escriu la nota: ");
                String nota = sc.nextLine();
                try {
                    FileWriter fw = new FileWriter("notes.txt", true);
                    fw.write(nota + "\n");
                    fw.close();
                    System.out.println("Nota afegida! ✅");
                } catch (IOException e) {
                    System.out.println("Error al guardar la nota.");
                }

            } else if (opcio.equals("2")) {
                System.out.println("\nLes teves notes:");
                try {
                    File fitxer = new File("notes.txt");
                    Scanner fitxerScanner = new Scanner(fitxer);
                    while (fitxerScanner.hasNextLine()) {
                        System.out.println("- " + fitxerScanner.nextLine());
                    }
                    fitxerScanner.close();
                } catch (IOException e) {
                    System.out.println("No hi ha notes encara.");
                }

            } else if (opcio.equals("3")) {
                System.out.println("Fins aviat! 👋");
            } else {
                System.out.println("Opció incorrecta!");
            }
        }

        sc.close();
    }
}
