public class que45{
  public static void main(String[] args) {
    int n = 5 ;
    int k = 1 ;
    for(int i = 1 ; i<=n ; i++){
      for(int j =1 ; j<=n ; j++){
        if(j<=i){
          if(j==1 || i == j || i == n){
          System.out.print(k++ +"  ");
        }else System.out.print("  ");
        }

      }System.out.println();
    }
  }


}
