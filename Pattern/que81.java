class que81 {
  public static void main(String[] args) {

    for (int i = 1; i <= 5; i++) {
      int k = 1;

      for (int j = 1; j <= 8; j++) {

        if (i == 1) {  // top row
          if (j <= 5)
            System.out.print((char) (k++ + 64)+" ");
          else
            System.out.print((char) (k-- + 64)+" ");
        }
        else if (j == 1 || j == 8) {  // side columns
          System.out.print("A ");
        }
        else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
