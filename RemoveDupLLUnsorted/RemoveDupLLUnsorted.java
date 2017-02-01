/*A QUESTION FROM CRACKING THE CODING INTERVIEW:
Write code to remove duplicates from an unsorted linked list.
FOLLOW UP:
How would you solve this problem if a temporary buffer is not allowed?

Remove duplicates from linked list (not sorted).
1) sort, then track value of previous seen/deleted node
    a) put into array O(n) + quicksort O(nlogn) + scan O(n) → O(nlogn)
    b) possibly put into array and modify sort to remove repeats (x==y)
2) for each node: track values of previous seen/deleted nodes
    a) for each node while track while see / dynamic prog. O(n)
FOLLOW UP:
How would you solve this problem if a temporary buffer is not allowed?
3) for each node: search through array for same value(s), ignoring current node
    a)sounds like insertion sort but it's a search; like a linear search repeated almost n times ; O(n^2)
4) a better way?
*/

import java.util.*;
public class RemoveDupLLUnsorted {
    
    nodeLL LL = null; // input
    nodeLL newLL = new nodeLL(); // duplicates removed
    Hashtable seen; // track values seen before
    
    // constructor: get input linked list and size the hashtable
    public RemoveDupLLUnsorted(nodeLL LL) {
        this.LL = LL;
        seen = new Hashtable(LL.size() * 2); // space issue! n*2
            // maybe binary search tree to minimize space but O(logn) time
    }
    
    // remove duplicate values from linked list ; store unique values in output LL
    public nodeLL removeDups() {
        nodeLL prev = null;
        LL = LL.next;
        while (LL != null) {
            //check seen values vs. current node's value
            boolean seenBefore = seen.containsValue(LL.value); // O(1) t.c.
            //check if not seen, then add to newLL
            if (seenBefore) {
                prev.next = LL.next;
            } else {
                newLL.add(LL.value);
                seen.put(1,LL.value); // would need to use hash function to get better keys
                prev = LL;
            }
            //if (seenBefore) LL.deleteVal(LL.value,LL);
            //iterate
            LL = LL.next;
        }
        return newLL; // LL
    }
    public static void main(String[] args) {
        nodeLL n = new nodeLL();
        n.add(1);
        n.add(2);
        n.add(2);
        n.add(2);
        n.add(2);
        n.add(3);
        n.add(3);
        n.add(2);
        n.add(2);
        n.add(2);
        n.add(2);
        n.add(3);
        n.add(2);
        n.add(2);
        n.printLL(); // use function to print out
        RemoveDupLLUnsorted test = new RemoveDupLLUnsorted(n); // given n as a filled nodeLL
        nodeLL outputLL = test.removeDups();
        System.out.println("...and after:");
        //System.out.println("outputLL = " + outputLL);
        //String face = (outputLL==null) ? ":(" : ":)";
        //System.out.println("outputLL should not be empty: (outputLL==null) = " + (outputLL==null) + " " + face);
        outputLL.printLL(); // use function to print out
            // later: use actual unit test code
    }
}