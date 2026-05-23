public class que41 {
    public static void main(String[] args) {

        int n = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n);
            }
            System.out.println();
            if (i < 3)
                n = n + 2;
            else
                n = n - 2;
        }
    }
}
