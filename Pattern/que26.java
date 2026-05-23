  public class que26{
  public static void main(String[] args) {
    int n = 7;
for(int i = 1; i <= n; i++) {          // rows
    for(int j = 1; j <= n; j++) { // column
      if(j<=i || i+j== n+ 1) System.out.print("* ");
      else System.out.print("  ");

    }
    System.out.println();
}

  }

}
