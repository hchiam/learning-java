public class CheckString {
    public static boolean uniqueLetters(String str) {
        String letters = "";
        for (char cS : str.toCharArray()) {
            if (letters != "") {
                for (char cL : letters.toCharArray()) {
                    System.out.println("letters: " + letters);
                    if (cS == cL) return false;
                }
            }
            // if did not found pre-existing in "remembered" letters:
            letters += cS;
        }
        System.out.println("letters: " + letters);
        return true;
    }
    public static boolean alternateFunction(String str) {
        boolean[] letters = new boolean[256];
        for (int i=0; i<str.length(); i++) {
            int val = str.charAt(i);
            if (letters[val]) return false;
            letters[val] = true;
        }
        return true;
    }
    public static void main(String[] args) {
        String myString = "example";
        Boolean check = alternateFunction(myString);
        System.out.println("Should be false: " + check);
        System.out.println("Got correct answer: " + (check==false));
    }
}