class que78{
  public static void main(String[] args) {
    for(int i = 1; i<= 9 ; i++){

        int x=65;
      for(int j = 1; j<=9 ; j++){

        if(j<= 6 - i || j>= 4 +  i || j<= i - 4 || j>= 14 -i){
          if(  j < 5  ) System.out.print((char)(x++ )+" ");
          else System.out.print((char)(x--)+" ");

        }else {
          System.out.print("  ");
          if(j<5) x++;
          else x--;
        }
      }System.out.println();
    }
  }

}
