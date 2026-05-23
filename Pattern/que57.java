class que57{
  public static void main(String[] args) {
    int k =1;
   
    for(int i = 1; i<=5 ; i++){
      for(int j = 1; j<=9 ; j++){
        if(j>= 6 - i && j<= 4+ i){


          if((j== 6 - i || j== 4 + i) )
          System.out.print(k+" ");
          else if( i== 5 && j % 2== 1 && j <=7)
              System.out.print(k++ +" ");
            else   System.out.print("  ");
        }else {
          System.out.print("  ");
        }

      }System.out.println();
    }
  }

}
