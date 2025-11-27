public class PalindromeString {
    public static void main(String[] args) {
        String s = "mommmy";
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s).reverse();
        if(s.equals(sb.toString())){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
