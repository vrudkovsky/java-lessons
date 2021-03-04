package lesson04.warmup;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function

//        Character[] bc = b.codePoints()
//                .mapToObj(ch -> (char) ch)
//                .sorted((c1, c2) -> c1.compareTo(c2)
//                .toArray(Character[]::new);

//        System.out.println(Arrays.toString(bc));

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}