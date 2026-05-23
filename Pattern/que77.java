class que77{
  public static void main(String[] args) {
    for(int i =1; i<=4 ; i++){
      for(int j = 1 ; j<=4 ; j++){
        if(i ==1 || i == 4 || j ==1 || j == 4){
          System.out.print((char)(j+64)+" ");
        }else System.out.print("  ");
      }System.out.println();
    }
  }

}
