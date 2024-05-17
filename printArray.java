public class printArray {
    public static void print(int [] A,int i){
        if(i == A.length) return;
        System.out.print(A[i]+" ");
        print(A,i+1);
    }
    public static void main(String[] args) {
        int [] A = {1,5,2,4,8,6,9};
        print(A, 0);
        System.out.println();
    }
}
