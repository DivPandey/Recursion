public class PowLinear {
    public static int powLinear(int a , int b){
        if(a == 0) return 0;
        if(b == 0) return 1;
        return a*powLinear(a, b-1);
    }
    public static void main(String[] args) {
        System.out.println(powLinear(0,0));
    }
}
