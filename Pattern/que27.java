public class que27 {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) { 
            int stars;

            if (i <= 3) {
                stars = i;
            } else {
                stars = i - 3;
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
