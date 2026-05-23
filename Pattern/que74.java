class que74{
  public static void main(String[] args) {
    for(int i = 1 ; i<= 5 ; i++){
      int k = 1;
      for(int j = 1; j<=9 ; j++){
        if(j<= 2 * i - 1){
          if(j < i) System.out.print((char)(k++ + 64)+" ");
          else System.out.print((char)(k-- + 64)+" ");
        }else {
          System.out.print("  ");
        }
      }System.out.println();
    }
  }

}
