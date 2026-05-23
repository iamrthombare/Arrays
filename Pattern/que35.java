public class que35 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {        // Row loop
            for (int j = 1; j <= 5; j++) {    // Single inner loop

                if (j < i)
                    System.out.print(" ");
                else
                    System.out.print(6 - j);

            }
            System.out.println();
        }
    }
}
