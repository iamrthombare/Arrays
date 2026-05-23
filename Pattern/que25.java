public class que25 {
    public static void main(String[] args) {

        int n = 11;
        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if ( (i <= mid && j >= mid - (i - 1) && j <= mid + (i - 1)) ||
                     (i > mid && j >= mid - (n - i) && j <= mid + (n - i)) ) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
