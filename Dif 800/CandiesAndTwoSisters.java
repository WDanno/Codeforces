import java.util.Scanner;

public class CandiesAndTwoSisters {
    public static void main(String[] args) {
        // INPUT
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                         // wie oft Werte engtgegennehmen
        int[] candyBag = new int[n];                  // Array der länge n
        for (int i = 0; i < candyBag.length; i++) {   // mache etwas so oft wie das Array lang ist / n mal
            candyBag[i] = sc.nextInt();               // füge in Array an der Stelle i einen Integer ein
        }


        // OUTPUT
        for (int j = 0; j < n ; j++) {
            int candy = candyBag[j];
            int a = (candy / 2 + candy % 2) - 1;
            System.out.println(a);
        }
    }
}
