

/**
 * TowerOfHanoi
 */
public class TowerOfHanoi {

    public static void toh(int A, String src, String aux, String des){
        if(A==0) return;
        toh(A-1, src, des, aux);
        System.out.println("move from "+src+" to "+des);
        toh(A-1,aux,src, des);
    }
    public static void main(String[] args) {
        toh(3,"a","b","c");
    }
}