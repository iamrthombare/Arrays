public class que28 {
    public static void main(String[] args) {

        int n = 9;
        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                // Upper half
                if (i <= mid) {
                    if (j >= mid - i + 1 && j <= mid + i - 1
                        && (j - (mid - i + 1)) % 2 == 0)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                // Lower half
                else {
                    if (j >= i - mid + 1 && j <= n - (i - mid)
                        && (j - (i - mid + 1)) % 2 == 0)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
