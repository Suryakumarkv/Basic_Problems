public class PrimeNumber {
    public static void main(String[] args) {
        int num = 7;
        boolean isPrime = false;

        if(num <=1) {
            isPrime = false;
        } else {
            for(int i=2;i<=Math.sqrt(num);i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                } else  {
                    isPrime = true;
                }
            }
            
        }

        if(isPrime) {
            System.out.println("Prime Number");
        }  else  {
            System.out.println("Not Prime Number");
        }
    }
}
