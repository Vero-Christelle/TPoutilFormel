public class Systeme{
   String etatActuel;
    public Systeme() {
        this.etatActuel = Etat.q0;
    }
    public void InsertionCarte(boolean carteValide) {
        switch (etatActuel) {
            case Etat.q0:
                if (carteValide) {
                    etatActuel = Etat.q1;
                    System.out.println(etatActuel);
                } else {
                   etatActuel = Etat.q4;
                    System.out.println(etatActuel);
                }
                break;
            default:
                break;
        }
    }
    public void EntreDeCode(boolean codeCorrect) {
        switch (etatActuel) {
            case Etat.q1:
                if (codeCorrect) {
                    etatActuel = Etat.q3;
                    System.out.println(etatActuel);
                } else {
                    etatActuel = Etat.q2;
                    System.out.println(etatActuel);
                }
                break;

            case Etat.q2:
                if (codeCorrect) {
                   etatActuel = Etat.q3;
                    System.out.println(etatActuel);
                } else {
                   etatActuel = Etat.q4;
                    System.out.println(etatActuel);
                }
                break;

            default:
                break;
        }
    }
}