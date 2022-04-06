import java.util.Arrays;

public class AdditionOfNumbers {

    public int Add(String numbers)
    {
        int output = 0;
        if(numbers.isEmpty()) return output;
        String delimeter = ",";
        StringBuilder stringBuilder = new StringBuilder();
        boolean negativeFound = false;
        if(isDoubleSlashFound(numbers))
        {
            delimeter = Character.toString(numbers.charAt(2));
            numbers = numbers.replaceAll("//"+delimeter, "");
        }
        numbers = numbers.replaceAll("\n",delimeter);
        String[] strStrs = numbers.split(delimeter);
        for (String ss: strStrs) {
            if(!ss.isEmpty())
            {
                int num = Integer.parseInt(ss);
                if (num < 0) {
                    stringBuilder.append(num + ",");
                    negativeFound = true;
                }
                output += num;
            }
        }

        if(negativeFound)
        {
            System.out.println("Negatives not allowed " +  stringBuilder.toString());
            throw new RuntimeException("Negatives not allowed");
        }
        return output;
    }

    public boolean isDoubleSlashFound(String str)
    {
        if(str.contains("//")) return true;
        return false;
    }
}
