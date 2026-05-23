public class que23 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {

            for (int j = 1; j <= 5; j++) {

                // Upper half
                if (i <= 5 && j <= i) {
                    if (j % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("# ");
                    }
                }

                // Lower half
                else if (i > 5 && j <= 10 - i) {
                    if (j % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("# ");
                    }
                }

            }

            System.out.println();
        }
    }
}
