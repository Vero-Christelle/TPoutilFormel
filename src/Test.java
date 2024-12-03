import java.util.Scanner;
public class Test {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Systeme systeme = new Systeme();
            System.out.println("Bienvenue dans le système de contrôle d'accès");
            boolean continuer= true;
            while (continuer) {
                System.out.print("Entrez '1' pour une carte valide ou '0' pour une carte invalide : ");
                int valide = scanner.nextInt();
                boolean carteValide = valide == 1;
                systeme.InsertionCarte(carteValide);
                if (systeme.etatActuel == Etat.q4) {
                    continuer=false;
                }
                while (systeme.etatActuel == Etat.q1|| systeme.etatActuel == Etat.q2) {
                    System.out.print("Entrez '1' pour un code correct ou '0' pour un code incorrect : ");
                    int correct = scanner.nextInt();
                    boolean codeCorrect = correct== 1;
                    systeme.EntreDeCode(codeCorrect);
                     if (systeme.etatActuel== Etat.q3 || systeme.etatActuel == Etat.q4) {
                        continuer=false;
                    }
                }
            }
        }
    }


