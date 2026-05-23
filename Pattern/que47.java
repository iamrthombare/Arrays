class que47{
  public static void main(String[] args) {
    int n = 9 ;
    int k = 1 ;
    for(int i = 1; i<=n ; i++){
      k=1;
      for(int j = 1; j<=n ; j++){
        if(i<5){
        if(j>= 6 - i && j<= 4 + i  ){
          if((i + j) % 2 == 0 ){
          System.out.print(k+" ");
          k++;}
          else System.out.print("  ");
        }else {
          System.out.print("  ");
        }
      }else if(j>= i - 4 && j<=14 - i) {
        if((i + j) % 2 == 0 ){
        System.out.print(k+" ");
        k++;}
        else System.out.print("  ");
      } else {
        System.out.print("  ");
      }
      }System.out.println();

    }
  }

}
