/**
 * PrintDecreasing
 */
public class PrintDecreasing {

    public static void printDec(int n){
        if(n==0) return;
        System.out.println(n);
        printDec(n-1);
    }
    public static void main(String[] divyanshu){
        printDec(10);
    }
   
}
