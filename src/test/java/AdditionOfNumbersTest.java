import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionOfNumbersTest {

    @Test
    public void isStringBlank()
    {
        AdditionOfNumbers additionOfNumbers = new AdditionOfNumbers();
        int output = additionOfNumbers.Add("");
        Assertions.assertEquals(0, output);
    }

    @Test
    public void isStringHas1NumberOnly()
    {
        AdditionOfNumbers additionOfNumbers = new AdditionOfNumbers();
        int output = additionOfNumbers.Add("1");
        Assertions.assertEquals(1, output);
    }

    @Test
    public void isStringHas2Number()
    {
        AdditionOfNumbers additionOfNumbers = new AdditionOfNumbers();
        int output = additionOfNumbers.Add("1,2");
        Assertions.assertEquals(3, output);
    }

    @Test
    public void isStringHasUnknownAmountOfNumber()
    {
        AdditionOfNumbers additionOfNumbers = new AdditionOfNumbers();
        int output = additionOfNumbers.Add("1,2,3,4,5");
        Assertions.assertEquals(15, output);
    }

}