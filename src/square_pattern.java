public class square_pattern {
    public static void main(String[] args) {
        int n=4;
        int count=1;
        int j=1;
        for(count=1;count<=n;count++){
            for(j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
