public class pattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3 * n; j++) {
                if (j <= i) {

                    System.out.print("*");
                } else if ((j >= ((2 * n) - i)) && (j <= ((2 * n) + i))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
