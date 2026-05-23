import java.util.*;
public class que19{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i = 1; i<=n;i++){
       //int k = 2 * n - 1;
      for(int j = 1 ;j<=n ;j++ ){
        if(j == 1 || j == n || i == j || i + j == n + 1 )
        System.out.print("* ");
        else System.out.print("  ");
      }System.out.println();
    }

  }

}
