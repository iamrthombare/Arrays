class que69{
  public static void main(String[] args) {
    for(int i = 1 ; i<= 5 ; i++){
      for(int j =1 ; j<= 5 ; j++){
        if(j<=i){
          if(i % 2== 0){
            System.out.print((char)(j + 64)+" ");
          }else System.out.print(j+" ");
        }
      }System.out.println();
    }
  }

}
