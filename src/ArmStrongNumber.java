public class ArmStrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int length = String.valueOf(num).length();

        int original = num;
        int sum = 0;

        while(num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, length);
            num = num/10;
        }

        if(sum == original) {
            System.out.println("Arm Strong Number");
        } else {
            System.out.println("Not Arm Strong Number");
        }
    }
}
