public class allPatterns {
    public static void main(String[] args) {
        int n =4;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n);


    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern3(int n) {

        for(int i = 0; i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern4(int n) {

        for(int i =1; i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern5(int n){
        for(int i =1; i<2*n ;i++){
            int c=i>n?2*n-i:i;
            for(int j=1;j<=c;j++){

                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println();

    }
    static void pattern6(int n){
        for(int i=0;i<n;i++){
            for (int s=0;s<n-i-1;s++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern7(int n){
        for(int i=0;i<2*n;i++){
            int c= i>n?2*n-i:i;
            int space=n-c;
            for (int spaces=0;spaces<space;spaces++){
                System.out.print(" ");
            }
            for(int j=0;j<c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int i=1;i<=n;i++){
            for(int space=0;space<n-i;space++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            for(int k=2;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for(int i=1;i<2*n;i++){
            int c= i>n ? 2*n-i:i;
            for(int space=0;space<n-c;space++){
                System.out.print(" ");
            }
            for(int j=c;j>=1;j--){
                System.out.print(j);
            }
            for(int k=2;k<=c;k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        int original=n;
        n=2*n-2;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int everyIndex=original-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(everyIndex+" ");
            }
            System.out.println();
        }
    }
}
