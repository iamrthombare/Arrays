import java.util.*;

class Search_matrix {

    public static int search(int arr[][], int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == k) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the search element:");
        int k = sc.nextInt();

        int result = search(arr, k);

        if (result == 1) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }


    }
}
