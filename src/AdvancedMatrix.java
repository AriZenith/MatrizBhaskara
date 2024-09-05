public class AdvancedMatrix {
    private double[][] matrix;

    public AdvancedMatrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public void solveQuadraticEquations() {
        for (double[] equation : matrix) {
            double a = equation[0];
            double b = equation[1];
            double c = equation[2];

            double discriminant = b * b - 4 * a * c;
            if (discriminant >= 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("Roots: %.2f, %.2f\n", root1, root2);
            } else {
                System.out.println("No real roots");
            }
        }
    }
    public static void main(String[] args) {
        double[][] matrix = {
            {1, -3, 2},
            {2, -4, 2},
            {1, -2, 1}
        };
        AdvancedMatrix advancedMatrix = new AdvancedMatrix(matrix);
        advancedMatrix.solveQuadraticEquations();
    }
}
