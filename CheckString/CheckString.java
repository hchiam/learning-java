public class CheckString {
    
    /*
     *Naive O(n^2) function:
     */
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
    
    /*
     *Better O(n) time complexity function:
     */
    public static boolean alternateFunction(String str) {
        boolean[] letters = new boolean[256]; // assumes ASCII range from 'a' to 'z'
        for (int i=0; i<str.length(); i++) {
            int val = str.charAt(i); // get index of boolean array
            if (letters[val]) {
                return false;
            } else {
                letters[val] = true;
            }
        }
        return true;
    }
    
    /*
     *Even better function that saves a little bit more space:
     */
    public static boolean alternateUsingBits(String str) { // assumes ASCII range starting from 'a'
        // save space by using a bit vector instead of an array
        int checker = 0; // each bit acts like a boolean array's elements
        for (int i=0; i<str.length(); i++) {
            int bit = str.charAt(i) - 'a'; // get position in checker's bits (using the relative value w.r.t. 'a' (since assume range starts from 'a'))
            // check if that bit is already set to true:
            if ((checker & (1 << bit)) > 0) { // (if the same bit in both checker and val is 1, then 1, which is > 0)
                return false;
            } else {
                checker |= (1 << bit);
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String myString = "example";
        Boolean check;
        
        System.out.println("\nuniqueletters(myString)");
        check = uniqueLetters(myString);
        System.out.println("Should be false: " + check);
        System.out.println("Got correct answer: " + (check==false));
        
        System.out.println("\nalternateFunction(myString)");
        check = alternateFunction(myString);
        System.out.println("Should be false: " + check);
        System.out.println("Got correct answer: " + (check==false));
        
        System.out.println("\nalternateUsingBits(myString)");
        check = alternateUsingBits(myString);
        System.out.println("Should be false: " + check);
        System.out.println("Got correct answer: " + (check==false));
    }
}