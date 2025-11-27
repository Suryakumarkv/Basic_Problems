public class Palindrome {
    public static void main(String[] args) {
        int num = 151;
        int org = num;
        int reversed = 0;
        while(num > 0){
            int digit = num % 10;
             reversed = reversed * 10 +digit;
            num = num/10;
        }
     if(reversed == org){
         System.out.println("Palindrome");
     }else {
         System.out.println("Not Palindrome");
     }
    }
}
