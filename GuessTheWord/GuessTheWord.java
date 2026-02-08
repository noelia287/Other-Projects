package PROVA.GuessTheWord;

import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args) {
        String[] paraules = {"python", "java", "html", "css", "javascript"};
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        String paraula = paraules[rand.nextInt(paraules.length)];
        char[] lletresEncertades = new char[paraula.length()];
        for (int i = 0; i < lletresEncertades.length; i++) {
            lletresEncertades[i] = '_';
        }

        int intents = 0;

        System.out.println("🎮 Joc: Endevina la paraula!");
        System.out.println(lletresEncertades);

        while (new String(lletresEncertades).contains("_")) {
            System.out.print("Escriu una lletra: ");
            String lletraInput = sc.nextLine().toLowerCase();
            char lletra = lletraInput.charAt(0);
            intents++;

            if (paraula.indexOf(lletra) >= 0) {
                for (int i = 0; i < paraula.length(); i++) {
                    if (paraula.charAt(i) == lletra) {
                        lletresEncertades[i] = lletra;
                    }
                }
                System.out.println("✅ Correcte! " + new String(lletresEncertades));
            } else {
                System.out.println("❌ No està. " + new String(lletresEncertades));
            }
        }

        System.out.println("🎉 Has encertat la paraula: " + paraula);
        System.out.println("Nombre d'intents: " + intents);

        sc.close();
    }
}
