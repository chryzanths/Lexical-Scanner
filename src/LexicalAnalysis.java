import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexicalAnalysis
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Source Language: ");
        String sourceCode = input.nextLine();

        System.out.print("Output:");

        // extracting value inside double quotes and grouping them together, it is to avoid strings splitting apart when there's a space
        Pattern p = Pattern.compile(".*\"([^\"]*)\".*");
        Matcher m1 = p.matcher(sourceCode);

        String[] arraySplit1 = sourceCode.split(" ");
        String[] arraySplit2 = sourceCode.split("");

        // extracting the numbers/integers
        String alteredInput = sourceCode.replaceAll("[abcdefghijklmnopqrstuvwxyz,='\"]", "").replaceAll(" ", "");


        for (String stringArray : arraySplit1)
        {
            if (stringArray.equals("int") || stringArray.equals("double") || stringArray.equals("char") || stringArray.equals("String"))
            {
                System.out.print(" <data_type> ");
            }
            else if (stringArray.equals("="))
            {
                System.out.print(" <assignment_operator> ");
            }
            else if (stringArray.contains("\'") || stringArray.contains(".") || stringArray.equals(alteredInput))
            {
                System.out.print(" <value> ");
            }
            else if (!stringArray.contains("\"") && !stringArray.contains("\'") && !stringArray.contains(".") && !stringArray.equals(alteredInput))
            {
                System.out.print(" <identifier> ");
            }
        }

        // if stringArray contains a string ("")
         if (m1.matches())
         {
             System.out.print(" <value> ");
         }


        for (String stringArray : arraySplit2) {

            if (stringArray.equals(";"))
            {
                System.out.print(" <delimiter> ");
            }
        }
    }
}


