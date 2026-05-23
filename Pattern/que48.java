public class que48{
  public static void main(String[] args) {
    int n = 7 ;
    int k=1;
    int mid = (n + 1)/ 2 ;
    for(int i = 1; i<= n ; i++){

      for(int j = 1; j<=n ;j++){
        if(i<=4){
        if( j <= 2 * i - 1){
         if(j % 2 == 1) System.out.print(k +" ");
        else   System.out.print("* ");
        }else {
          System.out.print("  ");
        }

      }else if(i>=5 && j<= 15 - 2 * i ){
        if(j % 2 == 1) System.out.print(k +" ");
          else System.out.print("* ");
      }else {
        System.out.print("  ");
      }

      }System.out.println();
      k=i>3?--k:++k;

    }
  }

}
