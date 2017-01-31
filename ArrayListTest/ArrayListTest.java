import java.util.*;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> aL = new ArrayList<String>();
        String[] a = {"a", "b", "c"};
        String[] b = {"d", "e", "f"};
        for (String letter : a) {
            aL.add(letter);
        }
        for (String letter : b) {
            aL.add(letter);
        }
        System.out.println(aL);
    }
}