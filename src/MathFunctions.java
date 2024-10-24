public class MathFunctions {
    int add(int a, int b){
        return a + b;
    }
    int sub(int a, int b){
        return a - b;
    }
    int multiply(int a, int b){
        return a * b;
    }
    int div(int a, int b){
        return a / b;
    }
    int abs(int a){
        return  Math.abs(a);
    }
    double add(double a, double b){
        return a + b;
    }
    double sub(double a, double b){
        return a - b;
    }
    double multiply(double a, double b){
        return a * b;
    }
    double div(double a, double b){
        if (b == 0) {
            throw new ArithmeticException("Denominator can not be 0!");
        }
        return a / b;
    }
    double abs(double a){
        return  Math.abs(a);
    }

    double pow(double a, double b){
        return Math.pow(a, b);
    }
}
