package arrays_strings;

public class GreatestCommonDivisorStrings {
    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }
    int gcd = gcd(str1.length(),str2.length());
        return str1.substring(0,gcd);
    }

    private static int gcd(int a, int b) {
      return (b==0)? a : gcd(b,a%b);
    }

    public static void main(String[] args) {

        System.out.println(gcdOfStrings("ABCABCABC","ABC"));
        System.out.println(gcdOfStrings("ABABABAB","AB"));
        System.out.println(gcdOfStrings("AB","ABABABABAB"));
    }

}
