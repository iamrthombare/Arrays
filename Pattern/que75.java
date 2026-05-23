class que75{
  public static void main(String[] args) {
    for(int i = 1; i<=5 ; i++){
      int k =1 ;
      for(int j = 1 ; j<= 9 ; j++){
        if(j==11 - 2 * i || j>= 11 - 2 * i){
          if(i % 2 == 0){
            if( j < 10 - i) {System.out.print(k++ +" ");}
            else System.out.print(k-- +" ");
          }else if( j < 10 - i) System.out.print((char)(k++ + 64)+" ");
            else System.out.print((char)(k-- + 64)+" ");
        }else {
          System.out.print("  ");
        }
      }System.out.println();
    }
  }

}
