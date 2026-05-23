class que80{
  public static void main(String[] args) {

    for(int i = 1 ;i<= 7 ; i++){
      int k = 65 ;

      for(int j = 1; j<= 8 ; j++)//column
      {

      if(i<4){
            if( j<=i || j>= 9 - i ){
              System.out.print((char)(k)+" ");
            //  System.out.print("# ");
          } else{
            System.out.print("  ");
          }

        }
        else if(j<= 8 - i || j>= i + 1){
            //System.out.print((char)(k++ + 64)+" ");
            System.out.print((char)(k)+" ");
          //  System.out.print("* ");
          }
          else {
            System.out.print("  ");

          }
          if(j<=4)
          {
            k++;
          }
          else
           k--;
           if(j==i)
             k--;
      }
      System.out.println();

      }
    }
  }
