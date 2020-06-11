import java.util.Scanner;

public class Reinforcement {


    public static void main(String[] args) {
        removePunctuation("Let's tr'y, Crazy things?");
    }



    /**
     * R-1.9 Write a short Java method that uses a StringBuilder instance to remove all the
     * punctuation from a string s storing a sentence, for example, transforming the
     * string "Let’s try, Mike!" to "Lets try Mike".
     */
    private static void removePunctuation(String val) {
        StringBuilder s = new StringBuilder(val);
        String punct = ",.'\"!?:;’";
        for (int i = 0; i < s.length() / 2; i++) {
            for (int j = 0; j < punct.length(); j++) {
                int index = s.indexOf(punct.charAt(j) + "");
                if (index != -1) {
                    s.deleteCharAt(index);
                }
            }
        }
        System.out.println(s);
    }


    /**
     * R-1.8 Write a short Java method that counts the number of vowels in a given character
     * string.
     */
    private static void countVowel(String val) {
        int count = 0;
        String vowel = "aeiou";
        for (int i = 0; i < val.length(); i++) {
            for (int j = 0; j < val.length(); j++) {
                if (val.charAt(i) == vowel.charAt(j) || val.charAt(i) == Character.toUpperCase(vowel.charAt(j))) {
                    count++;
                }
            }

        }
        System.out.println(count);

    }


    /**
     * R-1.7 Write a short Java method that takes an integer n and returns the sum of the
     * squares of all positive integers less than or equal to n.
     */
    private static int sumAllSquare(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    /**
     * R-1.6 Write a short Java method that takes an integer n and returns the sum of all the
     * --odd positive-- integers less than or equal to n.
     */
    private static int sumAllOdd(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    /**
     * R-1.5 Write a short Java method that takes an integer n and returns the sum of all
     * positive integers less than or equal to n.
     */
    private static int sumAll(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++){

            sum += i;
        }
        return sum;
    }


    /**
     * R-1.4 Write a short Java method, isEven, that takes an int i and returns true if and only
     * if i is even. Your method cannot use the multiplication, modulus, or division
     * operators, however.
     */
    private static boolean isEven(int i) {
        boolean isEven = true;
        for (int k = 0; k < i; k++){

            isEven = !isEven;
        }

        return isEven;
    }


    /**
     * R-1.3 Write a short Java method, isMultiple, that takes two long values, n and m, and
     * returns true if and only if n is a multiple of m, that is, n = mi for some integer i.
     */
    private static boolean isMultiple(long n, long m) {
        if (n % m == 0) {
            return true;
        }
        return false;
    }

}
