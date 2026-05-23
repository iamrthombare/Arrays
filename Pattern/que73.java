class que73{
  public static void main(String[] args) {

    for(int i = 1; i<=5; i++){
      int k = 1;
      for(int j =1; j<=5 ; j++){

        if(j >= i){
          if(i % 2== 0) System.out.print(k++ +" ");
          else System.out.print((char)(k++ + 64)+" ");
        }else {
          System.out.print("  ");
        }
      }System.out.println();
    }
  }

}
