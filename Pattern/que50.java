class que50{
  public static void main(String[] args) {
    int k = 1 ;
    for(int i = 1; i<=7 ; i++){

      for(int j = 1; j<=4 ; j++){
        if(i <= 4){
        if(i + j > 4){
          System.out.print(k+" ");
        }
        else{
          System.out.print("  ");
        }
      } else if(j>= i - 3){
        System.out.print(k +" ");
      }else System.out.print("  ");
      }System.out.println();
        k=i>3?--k:++k;
    }
  }

}
