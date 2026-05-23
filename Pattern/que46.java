class que46{
  public static void main(String[] args) {
    int n = 9 ;
    int k = 1 ;
    int mid = (n+ 1)/ 2 ;
    for(int i = 1; i<=n ; i++){
      for(int j = 1 ; j<=n ; j++){
        if(i<=5){
        if((i == 1 && mid== j) ||j == 6 - i || j == i + 4 ){
          System.out.print(k+" ");
        }else {
          System.out.print("  ");
        }
      }else if( j == i - 4 || j == 14 - i){
        System.out.print(k+" ");
      }else {
        System.out.print("  ");
      }
    }System.out.println();
      if(i<5) k++;
      else   k--;

    }
  }

}
