import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int o = 2;         //declare number of integers you will take as input
        int[] arr = new int[o];     //declare array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();   //take values
        }
        Scanner sc2 = new Scanner(System.in);
        int n = arr[0];
        int k = arr[1];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (arr2[i] == 0 ) {
                break;
            }
            else if (arr2[i] >= arr2[k-1]) {
                counter += 1;
            }

        }

        System.out.println(counter);


    }
}
