import java.util.Scanner;

class Matrix {
    int size;
    int[][] m;

    Matrix(int n) {
        this.size = n;
        this.m = new int[n][n];
    }

    void identity() {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if (i==j) m[i][i] = 1; else m[i][j] = 0;
            }
        }
    }

    void display() {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                System.out.printf("%s\t", m[i][j]);
            }
            System.err.println("");
        }
    }

    void setValue(int i, int j, int val) {
        m[i][j] = val;
    }
    
    int getValue(int i, int j) {
        return m[i][j];
    }

    
    Matrix mul(Matrix other) {
        Matrix res = new Matrix(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    res.m[i][j] += this.m[i][k] * other.m[k][j];
                    System.out.printf("%s, %s, %s \n",i,j,k);
                }
            }
        }
        return res;
    }
}


public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        Matrix mat = new Matrix(x);
        mat.setValue(0, 0, 5);
        mat.setValue(1, 0, 2);

        Matrix mat2 = new Matrix(x);
        mat.setValue(0, 1, 3);
        mat.setValue(1, 1, 1);

        Matrix res = mat.mul(mat2);
        res.display();
    }
}