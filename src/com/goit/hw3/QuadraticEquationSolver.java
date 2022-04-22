package com.goit.hw3;

public class QuadraticEquationSolver {
    public static void main(String[] args) {

//        QuadraticEquationSolver sol = new QuadraticEquationSolver();
//        System.out.println(sol.solve(1, -2, -3).toString());
    }

    public double[] solve(int a, int b, int c) {
        final double discriminate = b * b - 4 * a * c;

        if (discriminate > 0) {
            double x1 = (-b - Math.sqrt(discriminate)) / (2 * a);
            double x2 = (-b + Math.sqrt(discriminate)) / (2 * a);
            return new double[]{x1, x2};
        }
        if (discriminate == 0) {
            double x;
            x = -b / (2 * a);
            return new double[]{x};
        }
        return new double[]{};
    }

}
