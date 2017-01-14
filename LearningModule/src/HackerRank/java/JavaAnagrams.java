package HackerRank.java;

import java.util.Scanner;

public class JavaAnagrams {

static boolean isAnagram(String a, String b) {
	
	String copyOfs1 = a.replaceAll("\\s", "").toLowerCase();
	 
    String copyOfs2 = b.replaceAll("\\s", "").toLowerCase();

    //Initially setting status as true

    boolean status = true;

    if(copyOfs1.length() != copyOfs2.length())
    {
        //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length

        status = false;
    }
    else
    {
        //Converting copyOfs1 to char array

        char[] s1Array = copyOfs1.toCharArray();

        //Constructing StringBuilder from copyOfs2

        StringBuilder sb = new StringBuilder(copyOfs2);

        //Checking whether each character of s1Array is present in sb

        for (char c : s1Array)
        {
            int index = sb.indexOf(""+c);

            if (index != -1)
            {
                //If present, removing that character from sb

                sb = sb.deleteCharAt(index);
            }
            else
            {
                //If not present, setting status as false and breaking the loop

                status = false;

                break;
            }
        }
    }

    return status;
	
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
