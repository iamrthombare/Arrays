class que42{
  public static void main(String[] args) {
    int n = 5;
   int k = 1;
   //int k = start;
   for(int i = 1; i <= n; i++) {

     for(int j = 1; j <= n; j++)
     {
       System.out.print(k++ +" ");
       if(k==9) // when k become is 8 the reset the k 1 then starting from 1
       {
         k=1;
       }

     }
     System.out.println();
    }
  }

}
