public class PrintDecInc {
    public static void printDecInc(int n){
        if(n == 0)  return;
        System.out.println(n);
        printDecInc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printDecInc(5000);
    }
}
