public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 6;
        int first = 0;
        int second = 1;

        for(int i=2;i<=n;i++){
            int third = first + second;
            first = second;
            second = third;
        }
        System.out.println(second);
        System.out.println(RecFact(n));
    }


    public static int RecFact(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return RecFact(n-1) + RecFact(n-2);
    }
}
