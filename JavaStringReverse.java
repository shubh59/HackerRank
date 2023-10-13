/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints
will consist at most  lower case english letters.
 
Sample Input
madam

Sample Output
Yes
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if (isPalindrome(A))
 
            System.out.print("Yes");
        else
            System.out.print("No");
    }
    static boolean isPalindrome(String A)
    {
        int i = 0, j = A.length() - 1;
 
        while (i < j) {
            if (A.charAt(i) != A.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}






