/*

    author: Mark Jason T. Galang

*/

public class MyClass {
    public static void main(String args[]) {
        double[] color = new double[] {0.8, 0.8, 0.7};
        double[][] mat = new double[][] {
            {0.299, 0.587, 0.114},
            {0.596, -0.274, -0.322},
            {0.211, -0.523, 0.312}
        };
        System.out.println("Constant:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nGiven:");
        for (int i = 0; i < 3; i++) {
            System.out.print(color[i] + " ");
        }
        System.out.println("\n\nFinal Answer:");
        char[] letters = new char[] {'Y', 'I', 'Q'};
        for (int i = 0; i < 3; i++) {
            double res = 0;
            for (int j = 0; j < 3; j++) {
                res += mat[i][j] * color[j];
                System.out.print(mat[i][j] + " * " + color[j]);
                if (j < 2) {
                    System.out.print(" + ");
                } else {
                    System.out.print(" = ");
                }
            }
            System.out.printf("%c = %.4f\n", letters[i], res);
        }
    }
    
    static class Color {
        double R, G, B;
        
        Color(double R, double G, double B) {
            this.R = R;
            this.G = G;
            this.B = B;
        }
    }
}
