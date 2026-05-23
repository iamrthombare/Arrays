class que65{
  public static void main(String[] args) {
    int n  = 5;
    for(int i = 1 ;i<=n; i++){

      for(int j = 1; j<=n ; j++){
          int k = 6 - j;
        if(i + j > n)System.out.print((char)(k + 64)+" ");
        else System.out.print("  ");
      }System.out.println();
    }
  }


}
