class que59{
  public static void main(String[] args) {
    for(int i = 1 ; i<=5;i++){
      int k = i;
      for(int j =1 ; j<= 10 ; j++){
        if(j<=i ) System.out.print(j +" ");
        else if ( j>= 11 - i )System.out.print(k-- +" ");
        else System.out.print("  ");
      }System.out.println();
    }
  }

}
