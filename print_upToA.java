public class print_upToA {
    public static void print(int A){
        if(A == 0) return;
        print(A-1);
        System.out.print(A+" ");
    }
    public static void main(String[] args) {
        print(10);
        System.out.println();
    }
}
