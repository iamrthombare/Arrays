class que67{
  public static void main(String[] args) {
    for(int i = 1; i<=5 ; i++){
      int k = 1;
      for(int j = 1; j<=9 ; j++){
        if(j>= i && j<= 10 - i){
          if((i + j ) % 2 == 0){
            System.out.print((char)(k + 64)+" ");
            k++;
          }else {
            System.out.print("  ");
          }

        }else {
          System.out.print("  ");
        }
      }System.out.println();
    }
  }

}
