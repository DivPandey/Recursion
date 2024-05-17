public class digitSum {
    public static int sum(int A){
        if(A==0)return 0;
        return A%10+sum(A/10);
    }
    public static void main(String[] args) {
        System.out.println(sum(564));
    }
}
