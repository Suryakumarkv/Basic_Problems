import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class FreqOfCharacters {
    public static void main(String[] args) {
        String s = "mommmycomeonenaaz";

        int freq[] = new int[26];
        Arrays.fill(freq,0);

        for(int i=0;i<s.length();i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for(int i=0;i<26;i++) {
            if(freq[i]> 0) {
                char c = (char) (i + 'a');
                System.out.println(c + ": " +  freq[i] + " ");
            }
        }
        System.out.println(freq(s));
    }

    public static TreeMap<Character, Integer> freq(String s){
        TreeMap<Character,Integer> map = new TreeMap<>();

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(char c : map.keySet()) {
            System.out.println(c + " : " + map.get(c));
        }
        return map;
    }
}
