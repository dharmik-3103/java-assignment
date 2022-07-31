// 21CE021 - Dharmik Chondagar
// Display numbers in a pyramid pattern.

public class pattern {
    public static void main(String[] args) {
        int i, j, k, l, s = 13;

        for (i = 1; i <= 64; i *= 2) {
            for (l = s; l > 0; l--)
                System.out.print(" ");
            System.out.print("1 "); 

            for (j = 2; j <= i; j *= 2) {
                System.out.print(j + " ");
            }

            j = j / 2;
            for (k = j / 2; k >= 2;) {
                System.out.print(k + " ");
                k = k / 2;
            }
            if (i > 1)
                System.out.print("1 ");
            System.out.println();
            s -= 2;
        }

    }

}


