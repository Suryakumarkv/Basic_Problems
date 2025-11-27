public class VowelsAndConsonants {
    public static void main(String[] args) {
        String s = "Hello World  1245";
        s = s.toLowerCase();
        int vowels = 0;
        int Consonants = 0;
        int digits=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c >= '1' && c <= '9') {

                digits++;
            } else
            if(c >= 'a' && c <= 'z'){
                if(c == 'a' || c == 'e' || c == 'i' ||  c == 'o' || c == 'u'){
                    vowels++;
                } else {
                    Consonants++;
                }
            }
        }
        System.out.println(vowels);
        System.out.println(Consonants);
        System.out.println(digits);
    }
}
