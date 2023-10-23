public class AdvancePattern {

    //Hollow Rectangle Star Pattern
    public static void hollowPattern(int rows, int cols){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=cols; j++){
                if(i==1 || j==1 || i==rows || j==cols){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }

    // Inverted Half Pyramid and Rotated Star Pattern
    public static void invertedRotatedHalfPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
                for(int j=1; j<=i; j++){
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Inverted Number Pyramid Pattern
    public static void invertedNumberPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Floyd's Triangle Pattern
    public static void floydsTriangle(int n){
        int count=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    // 0 1 Number Triangle Pattern
    public static void triangle_01(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    // ButterFly Star Pattern
    public static void butterflyPattern(int n){
        // Outler Loop for Lines.
        for(int i=1; i<=n; i++){
            // Left Side Star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            //Middle Space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            //Right Start
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Inverted Loop
        for(int i=n; i>=1; i--){
            // Left Side Star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            //Middle Space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            //Right Start
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Solid Rhombus Star Pattern
    public static void solidRhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=i; j<=5; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Hollow Rhombus Star Pattern
    public static void hollowRhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=i; j<=5; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=n; j++){
                if(j==1 || j==n || i==1 || i==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Diamond Star Pattern
    public static void diamondPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=i; j<=5; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("* ");
            }
            System.out .println();
        }

        for(int i=n; i>=1; i--){
            for(int j=i; j<=5; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("* ");
            }
            System.out .println();
        }
    }

    // Number Pyramid Pattern
    public static void numberPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=i; j<=5; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    // Palindrome Number Pattern
    public static void plaindromePatter(int n){
        for(int i=1; i<=n; i++){
            for(int j=i; j<=5; j++){
                System.out.print("  ");
            }
            for(int k=i; k>=1; k--){
                System.out.print(k+" ");
            }
            for(int l=2; l<=i; l++){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
//        hollowPattern(5,5);
//        invertedRotatedHalfPyramid(7);
//        invertedNumberPyramid(5);
//        floydsTriangle(4);
//        triangle_01(5);
        butterflyPattern(4);
//        solidRhombus(5);
//        hollowRhombus(5);
//        diamondPattern(5);
//        numberPyramid(5);
//        plaindromePatter(5);
    }
}
