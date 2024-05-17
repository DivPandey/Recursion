public class Fibonachi {
    public static int fibo(int A){
        if(A == 0) return 0;
        if(A == 1) return 1;
        return fibo(A-1) + fibo(A-2);
    }
    
    public static void main(String[] args) {
        System.out.println(fibo(10));
    }
}
