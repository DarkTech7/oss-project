public class FunctionOverloading {
    public static int sumInt(int a, int b){
        return a+b;
    }

    public static int sumInt(int a, int b, int c){
        return a+b+c;
    
    }
    public static double sumInt(double a, double b){
        return a+b;
    }

    public static void main(String args[]){
        System.out.println(sumInt(1,2));
        System.out.println(sumInt(1,2,3));
        System.out.println(sumInt(1.2,2.3));
    }
}
