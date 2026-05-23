class que71{
  public static void main(String[] args) {
      int k = 1 , p = 1;
    for(int i = 1 ; i<=5 ; i++){
      for(int j = 1; j<= 9 ; j++){

        if(j>= 6 - i && j<= 4+ i){

          if(i % 2==0 ) System.out.print((char)(k++ + 64)+" ");
          else System.out.print(p++ +" ");
        }else {
          System.out.print("  ");
        }
      }System.out.println();
    }
  }

}
