class que83{
  public static void main(String[] args) {
    int k = 1;
    int n = 1;
    boolean b=true;
    for(int i = 1 ; i<= 5 ; i++){
      for(int j = 1 ;j<= 9 ; j++){
        if((j>= i && j<= 10 - i) || (j>= 6 - i && j<= i + 4) )
            if((i % 2 == 0 && j % 2 == 0) ||(j % 2 == 1 && i % 2 == 1) )
              if((i + j ) % 2 == 0 && b==true){
                System.out.print(n++ +" ");//1
                b=false;}
            else{
                System.out.print((char)(k++ + 64)+" ");
                b=true;}
           else
             System.out.print("  ");
        else
          System.out.print("  ");
      }System.out.println();
    }
  }

}
