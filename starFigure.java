import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] value = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                value[i][j] = ".";
                value[n / 2][j] = "*";
                value[i][n / 2] = "*";
                if (i == j || i == n - j - 1) {
                    value[i][j] = "*";
                }
                System.out.print(value[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}