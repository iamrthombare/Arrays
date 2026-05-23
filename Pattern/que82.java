class que82{
  public static void main(String[] args) {
    int k = 1;
    int n = 1;
    for(int i = 1; i<= 5 ; i++){
      for(int j = 1; j<=9 ; j++){
        if(j>= 6 - i && j<= 4 + i){
          if((j == 6 - i || j == 4 + i )|| (i == 5 && j % 2 ==1))
              if(i % 2 == 1 )
                  System.out.print(n++ +" ");
              else
                  System.out.print((char)(k++ + 64)+" ");

          else
              System.out.print("  ");
        }else {
          System.out.print("  ");
        }
      }System.out.println();
    }
  }

}
