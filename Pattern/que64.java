class que64{
  public static void main(String[] args) {


    for(int i = 1; i<= 5 ; i++){
      int n = 6 - i ;
      for(int j = 1; j<=5 + 1 - i; j++){
      
        System.out.print((char)(n + 64)+" ");
      }
      System.out.println();


    }
  }

}
