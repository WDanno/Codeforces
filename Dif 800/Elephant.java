


public class Elephant {
    public static void main(String[] args) {

        int x = new java.util.Scanner(System.in).nextInt();
        int a = x / 5;
        int b = x % 5;

        if (x <= 5)
            System.out.println(1);
        else if (b > 0)
            System.out.println(a + 1);
        else if (b == 0)
            System.out.println(a);

    }
}
