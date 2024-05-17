/**
 * PowLogarithmic
 */
public class PowLogarithmic {

    public static int powLog(int x, int n){
        if(n == 0) return 1;
        int xpnb2 = powLog(x, n/2);
        int xn = xpnb2 * xpnb2;

        if(n%2 == 1){
            xn *=x;
        }
        return xn;
    }
    public static void main(String[] args) {
        System.out.println(powLog(2, 22));
    }
}