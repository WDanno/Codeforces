public class bodyMassIndex {

    public static void main(String[] args) {

        bodyMassInd();

    }
    public static void bodyMassInd() {

        float groesse = 1.67f;
        float gewicht = 64;
        float bmi;

        bmi = gewicht / (groesse * groesse);

        System.out.println(bmi);

    }
}

