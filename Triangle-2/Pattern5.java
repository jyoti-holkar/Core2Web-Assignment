
class Pattern5 {
    public static void main(String[] args) {

        int n = 3;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if (i % 2 != 0) {
                    System.out.print(j + "\t");
                } else {
                    System.out.print((char)('A' + j - 1) + "\t");
                }
            }
            System.out.println();
        }
    }
}
