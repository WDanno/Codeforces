import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * n friends
 * k bottles
 * l milliliters
 * c limes / d slices
 * p grams salt
 *
 * tosts     nl milliliters
 *           d slices
 *           np grams salt
 *
 */

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o = 8;         //declare number of integers you will take as input
        int[] input = new int[o];     //declare array
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();   //take values
        }
        int n = input[0];
        int k = input[1];
        int l = input[2];
        int c = input[3];
        int d = input[4];
        int p = input[5];
        int nl = input[6];
        int np = input[7];

        // milliliters

        int mil = k * l;
        int mtoast = mil / nl;
        int miltoasts = mtoast / n;

        // limes

        int limes = c * d;
        int limetoast = limes / n;

        // salt

        int salt = p / np;
        int salttoast = salt / n;

        ArrayList<Integer> mintoasts = new ArrayList<>();
        mintoasts.add(miltoasts);
        mintoasts.add(limetoast);
        mintoasts.add(salttoast);

   //   int[] mintoasts = new int[miltoasts + limetoast + salttoast];
        // int minimum = mintoasts[0];



        System.out.println(Collections.min(mintoasts));



    }

}
