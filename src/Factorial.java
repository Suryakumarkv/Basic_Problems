import java.util.stream.StreamSupport;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;
        if(num == 0||num == 1){
            System.out.println(num);
        } else {
            for(int i=2;i<=num;i++) {
                factorial = factorial * i;
            }
        }
        System.out.println(RecFact(num));
        System.out.println(whileFact(num));
    }


    public static int RecFact(int num) {
        if(num == 0||num == 1){
            return 1;
        }
        return num * RecFact(num - 1);
    }

    public static int whileFact(int num) {
        int factorial = 1;
        int i = 1;
        while(i <= num){
            factorial = factorial * num;
            i++;
        }
        return factorial;
    }
}
