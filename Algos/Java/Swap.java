public class Swap {
    public static int number(int num1, int num2){
        int sum = num1 +num2;
        return sum;
    }

    public static double product(double a, double b){
        double sum = a*b;
        return sum;
    }

    public static int factorial(int num){
        int f=1;
        for(int i=1;i<=num;i++){
            f*=i;
        }

        return f;
    }

    public static int binCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int factnr = factorial(n-r);

        int coef=fact_n / (fact_r * factnr);
        return coef;
    }

    public static void main(String args[]){
        
        System.out.println(binCoeff(5,2));
    }
}
