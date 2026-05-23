import java.util.*;
public class que21{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //int n = sc.nextInt();
  //  int k = 2 * n - 1;
    for(int i = 1; i<=5 ; i++){
      for(int j =1 ; j<=9; j++){

          if(i == 1 || i==j ||  j == 10 - i){
            if((i + j) % 2 == 0 )
            System.out.print("* ");
            else System.out.print("  ");

          }


        else{
        System.out.print("  ");
      }
      }System.out.println();

    }

}

}
