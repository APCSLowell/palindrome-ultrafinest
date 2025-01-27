import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
        Scanner myReader = new Scanner(myFile);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            lines[counter] = data;
            counter++;
        }
        myReader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String sWord)
{
  String reverse = new String("");
  if(sWord.length() < 2)
    return true;
  for(int i = sWord.length() - 1; i >= 0; i--){
    reverse += Character.toString(sWord.charAt(i));
  }
  if(reverse.equals(sWord))
    return true;
  return false;  
}
public String reverse(String sWord)
{
  String reverse = new String("");
  if(sWord.length() < 2)
    return sWord;
  for(int i = sWord.length() - 1; i >= 0; i--){
    reverse += Character.toString(sWord.charAt(i));
  }
  return reverse;
}
}
