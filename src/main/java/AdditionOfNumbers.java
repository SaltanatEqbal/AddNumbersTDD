import java.util.Arrays;

public class AdditionOfNumbers {

    public int Add(String numbers)
    {
        int output = 0;
        String delimeter = ",";
        if(isDoubleSlashFound(numbers))
        {
            delimeter = Character.toString(numbers.charAt(2));
            numbers = numbers.replaceAll("//"+delimeter, "");
        }
        numbers = numbers.replaceAll("\n",delimeter);
        String[] strStrs = numbers.split(delimeter);
        for (String ss: strStrs) {
            if(!ss.isEmpty()) output += Integer.parseInt(ss);
        }
        return output;
    }

    public boolean isDoubleSlashFound(String str)
    {
        if(str.contains("//")) return true;
        return false;
    }
}
