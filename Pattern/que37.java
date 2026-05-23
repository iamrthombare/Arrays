class que37{
  public static void main(String[] args) {
    for(int i = 1; i<=5 ; i++){
       int n=1;
      for(int j =1 ; j<=9; j++){
        if(j>=i && j<=10-i){
        System.out.print(n+" ");
         n++;}
        else
        System.out.print("  ");
      }System.out.println();

    }
  }

}
