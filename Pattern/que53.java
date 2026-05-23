import java.util.*;
public class que53{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 5;
    int k = 1;
    for(int i = 1; i<=n ; i++){
      for(int j =1 ; j<=n+1-i; j++){
        if(  i == 1|| j == 1 ||j==n+1 - i){
        System.out.print(k+ " ");
          k++;}
        else {System.out.print("  ");}

      }System.out.println();

    }

}

}
