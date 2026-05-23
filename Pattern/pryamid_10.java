import java.util.*;
public class pryamid_10{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = 2 * n  ;
    for(int i = 1; i<=n ; i++){
      for(int j =1 ; j<=k; j++){
        if(j>=i && j<=k-i)
        System.out.print("*");
        else
        System.out.print(" ");
      }System.out.println();

    }

}

}
