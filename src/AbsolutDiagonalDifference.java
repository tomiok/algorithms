public class AbsolutDiagonalDifference {

  public static void main(String[] args) {
    AbsolutDiagonalDifference s = new AbsolutDiagonalDifference();

    int[][] m = {{11, 2, 4},
        {4, 5, 6},
        {10, 8, -12}};
    System.out.println(s.diffDiag2(m));
  }

  /**
   * <a href="https://www.hackerrank.com/challenges/diagonal-difference/problem">link</a>
   *
   * @param matrix the input matrix.
   * @return the diff of the 2 diagonals
   */
  private int diffDiagonal(int[][] matrix) {
    int length = matrix.length;
    int diagPrincipal = 0;
    int diagReverse = 0;

    for (int i = 0; i < length; i++) {
      diagPrincipal += matrix[i][i];
    }

    int c = 0;
    for (int i = length - 1; i >= 0; i--) {
      diagReverse += matrix[c][i];
      c++;

    }

    return Math.abs(diagPrincipal - diagReverse);
  }

  private int diffDiag2(int[][] matrix) {
    int length = matrix.length;
    int diagPrincipal = 0;
    int diagReverse = 0;
    int c = matrix.length - 1;
    for (int i = 0; i < length; i++) {
      diagPrincipal += matrix[i][i];
      diagReverse += matrix[i][c];
      c--;
    }

    return Math.abs(diagPrincipal - diagReverse);
  }

}
