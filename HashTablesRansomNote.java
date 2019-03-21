//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;

public class HashTablesRansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
    	Hashtable<String, Integer> myHashTable = new Hashtable<String, Integer>();
    	
    	for(String s : magazine)
    	{
    		if(myHashTable.containsKey(s))
    		{
    			myHashTable.put(s,  myHashTable.get(s) + 1);
    		}
    		else
    		{
    			myHashTable.put(s,  1);
    		}
    	}
    	
    	for(String s : note)
    	{
    		if(!myHashTable.containsKey(s))
    		{
    			System.out.println("No");
    			return;
    		}
    		else
    		{
    			if(myHashTable.get(s) > 1)
    			{
    				myHashTable.put(s,  myHashTable.get(s) - 1);
    			}
    			else
    			{
    				myHashTable.remove(s);
    			}
    		}
    	}
    	
    	System.out.println("Yes");
    	return;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
