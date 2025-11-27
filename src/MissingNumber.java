import java.util.HashMap;

public class MissingNumber {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,6};

        int n = num.length+1;

        int mussingLength = n * (n+1)/2;
         int sum = 0;
        for(int i=0;i<num.length;i++){
             sum += num[i];
        }
        System.out.println(mussingLength - sum);
    }
}
