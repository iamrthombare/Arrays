class que55{
  public static void main(String[] args) {
    for(int i = 1 ; i<=7; i++){
      int k = 1 ;
      for(int j = 1; j<=7 ; j++){
          if((j>= 5 - i && j<= 3+ i) &&( j>= i - 3&&j<= 11 - i) ){
            if(j<4){
            System.out.print(k+ " ");
            k++;}else {System.out.print(k+" ");
            k--;

            }
          }else {
            System.out.print("  ");
          }


      }System.out.println();
    }
  }

}
