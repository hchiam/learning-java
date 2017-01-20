/*
 *How to compile and run code in Terminal/Command-Line:
 *http://stackoverflow.com/questions/2360995/how-do-i-compile-and-run-a-program-in-java-on-my-mac
 *
 *Code copied on Jan-2017 from:
 *https://www.tutorialspoint.com/java/java_hashtable_class.htm
 *
 *I added commenting for learning purposes.
 */

/*
 *Example use of Java Utilities Hashtable:
 */
import java.util.*;

public class HashTableDemo {
   
   public static void main(String args[]) {
      // Create a hash table:
      Hashtable balance = new Hashtable(); // Java's utilities include hash table
      
      // Create helper variables:
      Enumeration names; // hash table keys (this example uses names of people)
      String str; // temporary string for print-out of name and balance for that name/key
      double bal; // temporary number for print-out for the balance
      
      // Add entries into the hash table:
      balance.put("Zara", new Double(3434.34));
      balance.put("Mahnaz", new Double(123.22));
      balance.put("Ayan", new Double(1378.00));
      balance.put("Daisy", new Double(99.22));
      balance.put("Qadir", new Double(-19.08));
      
      // Show all balances in hash table and store them in a helper Enumeration variable:
      names = balance.keys();
      
      // Print out all names and corresponding balances:
      while (names.hasMoreElements()) {
         str = (String) names.nextElement(); // get name (=key)
         System.out.println(str + ": " + balance.get(str)); // print out: "name: balance"
      }
      
      // Add a space to separate the next example action with Hashtable:
      System.out.println();
      
      // Deposit 1000 into Zara's account:
      bal = ((Double)balance.get("Zara")).doubleValue(); // get the current balance for name/key = "Zara"
      balance.put("Zara", new Double(bal + 1000)); // put in same key but with different value (updated value)
      System.out.println("Zara's new balance: " + balance.get("Zara")); // print out new balance for "Zara"
   }
}