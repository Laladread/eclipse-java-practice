/*
 * Latriss King Data Structures
 * This program check permutations or anagrams of a word and prints the word on the same line
 */
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.util.Arrays;

public class Anagram{

	static void isAnagramstring(String a, String b)

    {
//Replaces each substring of the string that matches the anagram
        String copyOfa = a.replaceAll("\\s", "");

        String copyOfb = b.replaceAll("\\s", "");

        boolean status = true;

        if(copyOfa.length() != copyOfb.length())

        {

               status = false;

        }

        else

        {
//Converts all of the characters in the String to lower case
            char[] aArray = copyOfa.toLowerCase().toCharArray();

            char[] bArray = copyOfb.toLowerCase().toCharArray();

            Arrays.sort(aArray);

            Arrays.sort(bArray);

            status = Arrays.equals(aArray, bArray);

        }

          if(status)

        {

            System.out.println(a+" and "+b+" are Anagrams");

        }

        else

        {

            System.out.println(a+" and "+b+" are not Anagrams");

        }

    }

    public static void main(String[] args) {

        try {

            Scanner in = new Scanner(System.in);

            System.out.print("enter name:");

            String fname;

            fname = in.nextLine();

            FileReader reader = new FileReader("input.txt");

            BufferedReader bufferedReader = new BufferedReader(reader);

           

            String line;
            
            String val[]=new String[7];

            int i=1;

            while ((line = bufferedReader.readLine()) != null) {

                System.out.println(line);

                val[i]=line;

                i++;

            }
//compares anagrams to each other
            isAnagramstring(val[1], val[2]);

            isAnagramstring(val[3], val[4]);

            isAnagramstring(val[5], val[6]);

            reader.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}