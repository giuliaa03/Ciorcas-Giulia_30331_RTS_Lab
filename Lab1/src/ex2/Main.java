package ex2;

public class Main {
    public static void print_matrix(int[][] m){
        for (int i = 0; i < m.length; ++i) {
            for(int j = 0; j < m[i].length; ++j) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\n");
    }
    public static int[][] sum(int[][] m1, int[][] m2){
        int[][] res = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
        };
        for (int i = 0; i < m1.length; ++i) {
            for(int j = 0; j < m1[i].length; ++j) {
                res[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return res;
    }
    public static int[][] product(int[][] m1, int[][]m2) {
        int[][] prod = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
        };
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                prod[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    prod[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return prod;
    }
    public static void main(String[] args) {

        int[][] m1 = {
                {2, 3, 1},
                {7, 1, 6},
                {9, 2, 4},
        };

        int[][] m2 = {
                {8, 5, 3},
                {3, 9, 2},
                {2, 7, 3},
        };
        print_matrix(m1);
        print_matrix(m2);
        print_matrix(sum(m1,m2));
        print_matrix(product(m1,m2));
    }
}