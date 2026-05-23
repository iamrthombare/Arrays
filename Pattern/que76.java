class que76{
  public static void main(String[] args) {
    for(int i = 1 ; i<=9 ; i++){
      int k = 1;
      for(int j = 1; j<= 9 ; j++){
        if(j>= 6 - i && j<= 4 + i && j>= i - 4 && j<= 14 - i){
          if(i % 2 == 1){
            if(j<5) System.out.print((char)(k++ + 64)+" ");
            else System.out.print((char)(k-- + 64)+" ");
          }
          else{ System.out.print("# ");}
        }else {
          System.out.print("  ");
        }
      }System.out.println();
    }
  }

}
