class que49{
  public static void main(String[] args) {
    int n = 7 ;
    for(int i = 1; i<=n ; i++){
      for(int j = 1; j<=n ; j++){
        if(i<=4){
        if(j>=i && j<=8-i){
          System.out.print(i+" ");
        }else {
          System.out.print("  ");
        }
      } else if(j>= 8 - i &&j<=i){
        System.out.print(i+" ");
      }else {
        System.out.print("  ");
      }
      }
        System.out.println();
    }
  }

}
