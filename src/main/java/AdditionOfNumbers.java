public class AdditionOfNumbers {

    public int Add(String numbers)
    {
        int output = 0;
        String[] strs = numbers.split(",");
        for (String s: strs) {
            if(!s.isEmpty()) output += Integer.parseInt(s);
        }
        return output;
    }
}
